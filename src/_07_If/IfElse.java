package _07_If;

public class IfElse {
    public static void main(String[] args) {
        /*
        조건문 if-else
        형식) if(조건) {
                조건이 참일 때 실행되는 코드
             }else{
                조건이 거짓일 때 실행되는 코드
             }
         */

        int height = 120;
        if(height >= 120){
            System.out.println("Available for boarding");
        }else{
            System.out.println("Unable to boarding..");
        }
    }
}
