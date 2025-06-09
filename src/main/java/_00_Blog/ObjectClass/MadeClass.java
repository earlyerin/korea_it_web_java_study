package _00_Blog.ObjectClass;

import java.util.Scanner;

public class MadeClass {
    public static void main(String[] args) {
        login();
    }

    public static void login(){ //로그인
        String id = "Levelup";
        String pw = "012!";

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("아이디 입력>> ");
            String inputId = scanner.nextLine();
            if (id.equals(inputId)) { //저장된 아이디와 입력된 아이디의 값이 동일하면
                System.out.print("비밀번호 입력>>");
                String inputPw = scanner.nextLine();
                if(pw.equals(inputPw)) { //저장된 비밀번호와 입력된 비밀번호의 값이 동일하면
                    System.out.println("로그인 성공!");
                }else{
                    System.out.println("비밀번호가 잘못되었습니다.");
                }
            }else{
                System.out.println("아이디가 잘못되었습니다.");
            }
        }
    }
}