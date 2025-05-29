package _18_Overloading;

public class Overloading {
    /*
    ***** 오버로딩 ***** (면접 질문)
    메소드 오버로딩 : 같은 이름의 메소드를 여러 개 선언
    단, 매개변수의 타입이 다르거나 개수가 달라야 한다.
     */
    public static int getPower(int number){
        return number * number;
    }

    public static int getPower(double doubleNum){
        int number = (int)doubleNum;
        return number * number;
    }

    public static int getPower(String strNum){
        int number = Integer.parseInt(strNum);
        return number * number;
    }

    public static int getPower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        //getPower() 메소드 오버로딩
        System.out.println(getPower(3));
        System.out.println(getPower(2.3));
        System.out.println(getPower("4"));
        System.out.println(getPower(2,4));

        //printInfo() 메소드 오버로딩
        printInfo("이예린");
        printInfo("이예린", 21);
        printInfo("이예린", 21, "admin");

        //add() 메소드 오버로딩
        add(10,20);
        add(123.45, 467.75);
        add("1", "2");

    }

    /* 퀴즈
    메소드명 : printInfo()
    1. 문자열 이름을 매개변수로 받아 출력
    2. 문자열 이름, 정수 나이를 매개변수로 받아 출력
    3. 문자열 아름, 정수 나이, 문자열 이메일을 매개변수로 받아 출력
     */
    public static void printInfo(String name) {
        System.out.println("이름 : " +  name);
    }

    public static void printInfo(String name, int age) {
        System.out.println("이름 : " +  name);
        System.out.println("나이 : " + age);
    }

    public static void printInfo(String name, int age, String email) {
        System.out.println("이름 : " +  name);
        System.out.println("나이 : " + age);
        System.out.println("이메일 : " + email);
    }

    /* 퀴즈
    메소드명 : add()
    1. int와 int 덧셈
    2. double과 double 덧셈
    3. 문자열숫자와 문자열숫자 덧셈
     */
    public static void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void add(double a, double b) {
        System.out.println(a + b);
    }
    public static void add(String a, String  b) {
        System.out.println(Integer.parseInt(a) + Integer.parseInt(b));
    }

}
