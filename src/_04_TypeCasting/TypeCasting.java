package _04_TypeCasting;

public class TypeCasting {
    public static void main(String[] args) {
        /*
        형변환(TyeCasting)
        double -> float -> long -> int  (표현 범위의 감소) : 강제 형변환 필요
        int -> long -> float -> double (표현 범위의 증가) : 자동 형변환 가능
         */

        //정수 -> 실수
        int scoreInt = 98;
        System.out.println(scoreInt);
        System.out.println((float)scoreInt);
        System.out.println((double)scoreInt);
        System.out.println(scoreInt);

        //실수 -> 정수
        float scoreFloat = 97.5f;
        System.out.println(scoreFloat);
        System.out.println((int)scoreFloat);

        double scoreDouble = 88.5;
        System.out.println(scoreDouble);
        System.out.println((int)scoreDouble);

        double sum1 = 98 + 77.3;
        System.out.println(sum1);

        int sum2 = 98 + (int)55.3f;
        System.out.println(sum2);

        //강제 형변환
        int convertedScoreInt = (int)scoreDouble;
        System.out.println(convertedScoreInt);

        //자동 형변환
        double convertedScoreDouble = scoreInt;
        System.out.println(convertedScoreDouble);

        long scoreLong = 45L;
        convertedScoreInt = (int)scoreLong;
        System.out.println(convertedScoreInt);

        //정수 -> 문자열
        String strNum1 = String.valueOf(55);
        strNum1 = Integer.toString(55);
        System.out.println(strNum1);

        //실수 -> 문자열
        String strNum2 = String.valueOf(88.37);
        strNum2 = Double.toString(88.27);
        System.out.println(strNum2);

        String strNum3 = String.valueOf(123.45f);
        strNum3 = Float.toString(123.45f);
        System.out.println(strNum3);

        //문자열("123") -> 정수(123)
        int i = Integer.parseInt("123");
        System.out.println(i);

        //문자열("123.45") -> 실수(123.45)
        double d = Double.parseDouble("123.45");
        System.out.println(d);

    }
}
