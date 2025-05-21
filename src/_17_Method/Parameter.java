package _17_Method;

public class Parameter {
    /*
    매개변수(전달 값)
     */
    public static void  power(int number) {
        //매개변수를 전달 받아서 해당 매개변수를 거듭제곱하는 메소드
        int result  = number * number;
        System.out.println(number + "의 2승 : " + result);
    }

    public static void powerByExp(int number, int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        System.out.println(number + "의 " + exponent +"승은 " + result + "입니다.");
    }

    public static void main(String[] args) {
        int num = 3;
        power(num);
        powerByExp(num,num);

        getAvg(80, 90, 100);
        isEven(9);
    }

    /* 퀴즈1
    세 개의 정수를 전달하여 평균을 출력하는 메소드
     */
    public static void getAvg(int num1, int num2, int num3) {
        System.out.println("평균 : " + (double)(num1 + num2 + num3) / 3);
    }

    /* 퀴즈2
    정수를 전달하여 짝수인지 홀수인지 판별하는 메소드
     */
    public static void isEven(int number) {
        String result = (number % 2 == 0)? "짝수" : "홀수";
        System.out.println(number + "=>" + result);
    }
}
