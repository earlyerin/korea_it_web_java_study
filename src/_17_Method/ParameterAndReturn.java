package _17_Method;

public class ParameterAndReturn {

//    public static void power(int number) {
//        //매개변수를 전달 받아서 해당 매개변수를 거듭제곱하는 메소드
//        int result  = number * number;
//        System.out.println(number + "의 2승 : " + result);
//    }

    public static int getPower(int number){
        //매개변수를 전달 받아서 해당 매개변수를 거듭제곱하여 반환하는 메소드
        return number * number;
    }

//    public static void powerByExp(int number, int exponent){
//        int result = 1;
//        for (int i = 0; i < exponent; i++) {
//            result *= number;
//        }
//        System.out.println(number + "의 " + exponent +"승은 " + result + "입니다.");
//    }

    public static int getPowerByExp(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        int power = getPower(3);
        System.out.println(power);

        int powerByExp = getPowerByExp(3, 4);
        System.out.println(powerByExp);

        System.out.println(getStrLength("안녕하세요. 현재 시각 8시 44분.."));
    }

    /* 퀴즈
    문자열을 매개변수로 전달하고 해당 문자열의 길이를 반환받아서 출력
     */
    public static int getStrLength(String str) {
        return str.length();
    }
}
