package _34_Exception;

import java.util.Scanner;

/*
 퀴즈
 1. 사용자로 부터 두 개의 정수를 입력받는다.
 2. 첫 번째 수를 두 번째 수로 나눈 결과를 출력한다.
 3. 두 번째 수가 0 일 경우 발생하는 예외를 처리한다.
 */
public class DivideException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자1 입력>>");
        int num1 = sc.nextInt();
        System.out.print("숫자2 입력>>");
        int num2 = sc.nextInt();

        try {
            int result = num1 / num2;
            System.out.println(num1 + " / " + num2 + " = " + result);
        }catch (ArithmeticException e){
            System.out.println("0 으로 나눌 수 없습니다. " + e.getMessage());
        }finally {
            System.out.println("프로그램 정상 종료...");
        }
    }
}
