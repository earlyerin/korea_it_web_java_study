package _34_Exception;

import java.util.Scanner;

/*
 퀴즈
 1. 회원가입을 위해 이름과 나이를 메서드로 전달한다.
 2. 만약 나이가 14세 미만이면 사용자 정의 예외 발생
 */
public class SignUpException {
    public static void main(String[] args) {
        Join join = new Join();
        Scanner sc = new Scanner(System.in);

        System.out.print("이름:");
        String name = sc.nextLine();
        System.out.print("나이:");
        int age = sc.nextInt();

        try{
            join.inputInfo(name, age);
            join.printInfo();
        } catch (LoginAgeException e){
            System.out.println(e.getMessage());
        }

    }
}

class LoginAgeException extends Exception{
    public LoginAgeException(String message) {
        super(message);
        System.out.println("회원가입 실패...");
    }
}

class Join{
    private String name;
    private int age;

    public void inputInfo(String name, int age) throws LoginAgeException {
        if(age < 14){
            throw new LoginAgeException("14세 이상만 회원가입이 가능합니다.");
        }else {
            setAge(age);
            setName(name);
            System.out.println("회원가입 완료!");
        }
    }
    public void printInfo(){
        System.out.println("회원정보[이름:" + getName() + "|나이:" + getAge() + "]");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}