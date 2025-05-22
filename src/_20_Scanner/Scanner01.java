package _20_Scanner;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        /*
        Scanner Class => 입력

        next() : 토큰 단위로 읽는다.
        nextLine() => 엔터가 입력될 때까지
        토큰 : 공백문자(띄어쓰기, 탭, 엔터)
         */
        Scanner sc = new Scanner(System.in);

        //문자열 입력 받기
//        String str1 = sc.next();
//        String str2 = sc.next();
//
//        System.out.println("str1 : " + str1);
//        System.out.println("str2 : " + str2);
//
//        String str3 = sc.nextLine();
//        System.out.println("str3 : " + str3);

        //정수 입력받기
//        int num1 = sc.nextInt();
//        int num2 = sc.nextInt();
//        System.out.println("num1 : " + num1);
//        System.out.println("num2 : " + num2);

        //입력 123 enter
//        int num = sc.nextInt(); // 123 + 버퍼 메모리 => \n
//        String str = sc.nextLine(); // \n 입력으로 인식

        //해결
        int num = sc.nextInt(); // 123 + 버퍼 메모리 => \n
        sc.nextLine(); // 버퍼 비우기
        String str = sc.nextLine();

        System.out.println("num : " + num);
        System.out.println("str : " + str);

        /* 퀴즈
        나이와 이름 입력 받아서 출력
         */
        System.out.print("나이 입력>>");
        int age = sc.nextInt();
        System.out.print("이음 입력>>");
        String name = sc.next();

        System.out.println("나이 : " + age);
        System.out.println("이름 : " + name);
    }
}
