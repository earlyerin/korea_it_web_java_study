package _34_Exception;

/*
 오류
 - 에러(error) : 시스템적 오류(JVM 처리 불가)
 - 예외(Exception) : 개발자가 처리 가능한 오류
   Exception은 프로그햄 실행 중 발생할 수 있는 비정상적인 상황을 객체로 표현한 것
 */
/*
 예외 처리
 - Java의 특성 상 예외가 하나라도 발생하면 전체 컴파일 실패
 - 예외가 발생한 지점에서 처리하지 않으면 프로그램 비정상 종료
   따라서 예외 처리 구문으로 예외 상황에 대한 적절한 대응을 통해 정상 동작하도록 처리
 */

public class Exception01 {
    public static void main(String[] args) {
        //RuntimeException
        int a = 10;
        int b = 0;
//      int result = a / b; => ArithmeticException ( / by zero)

        /*
         try - catch - finally
           만약 예외가 발생한다면 생성된 예외 객체를 받아 처리할 코드 작성
         throws, throw 키워드
           의도적으로 예외를 발생시키기 위해 throw 키워드 사용
         */

        try {
            //예외 발생 가능성이 있는 코드
            int result = a / b;
            System.out.println("결과 : " + result);
        } catch (ArithmeticException e){
            //예외가 발생했을 때 처리할 코드
            System.out.print("0 으로 나눌 수 없습니다. ");
            System.out.println(e.getMessage()); //본래 예외 메세지
        } finally {
            //예외 발생 유무와 상관 없이 실행되는 코드
            System.out.println("프로그램 정상 종료...");
        }


        int[] numbers = {1,2,3};
        try{
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("배열 인덱스 범위를 벗어났습니다. " + e.getMessage());
        } catch (Exception e){
            throw new RuntimeException(); //런타임 예외를 발생시킴
        }



    }
}
