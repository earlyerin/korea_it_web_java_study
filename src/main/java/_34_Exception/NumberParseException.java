package _34_Exception;

import java.util.Scanner;

/*
 퀴즈
 1. 사용자로부터 문자열 형태의 입력을 받는다.
 2. 입력된 문자열을 Integer.parseInt()를 사용하여 정수로 변환한다.
 3. 변환된 숫자를 출력한다.
 4. 만약 변환하는 과정에서 입력값이 숫자가 아닌 경우 예외 처리
 */
public class NumberParseException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력 : ");
        String str = sc.nextLine();

        try {
            int result = Integer.parseInt(str);
            System.out.println("입력한 숫자 : " + result);
        }catch (NumberFormatException e){
            System.out.println("숫자가 아닌 값을 입력하였습니다. " + e.getMessage());
        }finally {
            System.out.println("프로그램 정상 종료...");
            sc.close();
        }

    }
}
