package _21_Class.BankAccount;

public class BankAccount {
    /*
    기본값
    Integer : Null (Getter & Setter 사용 시 예외처리 필요)
    int : 0
     */
    private int balance;

    BankAccount () { //계좌 개설
        System.out.println("계좌가 개설되었습니다.");
        System.out.println("현재 잔액 : " + balance + "원");
    }

    /*
    입금과 출금 기능의 메소드들과 setter 메소드의 차이
    속성 값을 변경한다는 점을 같다.
    1. setter 메소드는 값을 직접적으로 변경한다.
    값을 계산해선 변경하므로 임금과 출금 메소드는 행위에 중점을 둔다.
    2. setter는 일반적으로 검증 단계를 포함하지 않는다.
    기능을 구현한 메소드는 검증 단계를 포함할 수 있다.
     */
    public void deposit(int amount){ //예금
        if(amount > 0){
            balance += amount;
            System.out.println("계좌에 " + amount + "원이 입금되었습니다.");
            System.out.println("현재 잔액 : " + balance + "원");
        }else { System.out.println("0원 이상만 입금 가능합니다."); }
    }

    public void withdraw(int amount){ //출금
        if(amount <= balance && amount > 0){
            balance -= amount;
            System.out.println("계좌에서 " + amount + "원이 출금되었습니다.");
            System.out.println("현재 잔액 : " + balance + "원");
        } else {
            System.out.println("잔액이 부족합니다.");
            System.out.println("현재 잔액 : " + balance + "원");
        }
    }

    public int getBalance() { //잔액 조회
        return balance;
    }
}
