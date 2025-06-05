package _34_Exception;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

import java.util.Scanner;

/*
 궁금증 : throws 키워드를 사용해서 예외를 전가하더라도 결국에는 try-catch 구문으로
         처리해야하는데 왜 예외 던지기를 사용하는가?
 예외 던지기를 사용해서 메서드를 호출한 곳으로 예외를 전달하면
 메서드마다 예외 처리 구문을 작성하지 않아도 되기 때문에 "코드가 간결"해지고
 메서드의 기능 구현에만 집중하도록 책임을 분리하여 "가독성"과 "유지보수 향상"에 기여한다.

    * 즉, 최종적으로는 try-catch 구문으로 예외 처리를 해야하지만,
      메서드가 중첩된 형태로 호출이 빈법하다고 해도 가장 상위에 있는 메서드를 호출한 곳에서만 처리하면 된다.

 예제)    requestTransaction() -> processTransaction() 호출
         processTransaction() ->bankAccount.deposit()과 backAccount.withdraw() 호출
         bankAccount.deposit()과 backAccount.withdraw() -> checkPassword() 호출

         requestTransaction(){

            processTransaction(){
                bankAccount.deposit(){ //SecurityException
                    checkPassword()
                }

                backAccount.withdraw(){ //InsufficientBalanceException , SecurityException
                    checkPassword()
                }
            }

         }
     => 만약 throws로 전달되지 않았다면 최초로 예외를 발생시킨 메서드 withdraw(),deposit()
        뿐만 아니라 해당 메서드를 호출한 모든 메서드에 try-catch 구문을 작성해 예외 처리를 해야한다.
        그럼 코드 중복이 많아지고 가독성이 떨어질 수 밖에 없다.
 */
public class WhyThrows {
    public static void main(String[] args) {
        TransactionManager manager = new TransactionManager();
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("1.예금 2.출금");
            String transaction = sc.nextLine();
            System.out.print("금액 : ");
            int money = Integer.parseInt(sc.nextLine());


            try {
                manager.requestTransaction(transaction, money); //최상위 메서드에서 예외 처리
            }catch (InsufficientBalanceException e){
                System.out.println(e.getMessage());
            }catch (SecurityException e){
                System.out.println(e.getMessage());
                break;
            }
        }


    }
}

//사용자 정의 예외 처리 클래스
class InsufficientBalanceException extends RuntimeException{
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

//은행 계좌 클래스
class BankAccount{
    private int money = 10000;
    private int password = 1234;
    /*
    final로 선언하는 이유 : final로 선언하면 초기화 후 재할당되지 않는다.(불변성)
    내부 데이터를 수정하면서도 객체 자체의 참조는 보호할 수 있기 때문에,
    프로그램의 예측 가능성과 안전성이 향상된다.

    따라서, 거래 기록을 저장하는 객체의 참조를 유지하기 위해 final로 선언했다.
     */
    private final JsonObject transactionRecord = new JsonObject();
    private final JsonObject changeViewRecord = new JsonObject();

    public String deposit(int amount) { //예금 메서드 //throws SecurityException 생략
        if(!checkPassword()){
            throw new SecurityException("비밀번호 입력 횟수를 초과했습니다." +
                    "해당 계좌의 거래가 정지됩니다.");
        }
        money += amount;
        return amount + "원 입금, 잔액 : " + money + "원";
    }
    /*
     Java 내장 예외클래스 사용시 throws 키워드를 생략하는 이유
     : 정확히 말하면 Java에 내장된 예외클래스 중 비체크 예외인 경우에 생략이 가능하다.
       1. 자바 컴파일러가 비체크 예외는 처리를 강제하지 않기 때문이다.
       2. 개발자의 실수, 논리 오류로 인해 비체크 예외가 발생하므로
          throws로 예외을 전달하는 것보다 "잘못 설계한 코드를 고쳐서 해결하는 것이 바람직"하기 때문이다.

      사용자 정의 예외클래스인 InsufficientBalanceException도 RuntimeException을 상속받았기 때문에
      throws 생략이 가능하지만 "예외 흐름 명확화"를 위해 생략하지 않았다.
     */

    public String withdraw(int amount)
            throws InsufficientBalanceException{ //출금 메서드
        if(!checkPassword()){
            throw new SecurityException("비밀번호 입력 횟수를 초과했습니다." +
                    "해당 계좌의 거래가 정지됩니다.");
        }
        if(amount > money){
            throw new InsufficientBalanceException("잔액이 "
                    + (amount - money) + "원 부족 합니다.");
        }
        money -= amount;
        return "출금 금액 : " + amount + "원, 잔액 : " + money + "원";
    }

    public void record(String transaction, int money){ //거래 기록 저장 메서드
        transactionRecord.addProperty(transaction, money);
        changeViewRecord.add("거래 기록", transactionRecord);
    }

    public String viewTransactionRecord(){ //거래 기록 열람 메서드
        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();
        return gsonBuilder.toJson(changeViewRecord);
    }

    private int count = 5;
    private boolean checkPassword() {
        Scanner sc = new Scanner(System.in);
        while (count != 0) {
            System.out.print("비밀번호 : ");
            int password = sc.nextInt();

            if (this.password != password) {
                System.out.println("비밀번호가 잘못되었습니다. " +
                        "[입력 가능 횟수 : " + --count + "]");
            }else {
                return true;
            }
        }
        return false;
    }

}

//거래 관리자 클래스
class TransactionManager{
    private BankAccount bankAccount = new BankAccount();

    public TransactionManager() {
        System.out.println("-------------------- WhyThrowBank ------------------");
    }

    public void requestTransaction(String transaction, int money) //거래 요청
            throws InsufficientBalanceException {
        System.out.println((int)(Math.random() * 10 + 1) + "번 창구에서 거래 도와드리겠습니다.");
        processTransaction(transaction, money);
    }


    public void processTransaction(String transaction, int money) //거래 처리
            throws InsufficientBalanceException {
        if(transaction.equals("예금")){
            System.out.println(bankAccount.deposit(money));
        } else if (transaction.equals("출금")) {
            System.out.println(bankAccount.withdraw(money));
        }
        completeTransaction(transaction,money);
    }

    public void completeTransaction(String transaction, int money){ //거래 완료
        bankAccount.record(transaction,money);
        System.out.println(bankAccount.viewTransactionRecord());
        System.out.println("거래가 완료되었습니다.");
    }
}
