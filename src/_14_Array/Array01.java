package _14_Array;

public class Array01 {
    public static void main(String[] args) {
        /*
        배열
        - 같은 자료형의 데이터를 여러개 저장하는 연속적인 공간
        - 고정된 크기
         */
        String country1 = "Hungary";
        String country2 = "Croatia";
        String country3 = "Slovenia";
        String country4 = "Austria";
        String country5 = "Czech";

        //선언 및 크기 지정
        String[] countries1 = new String[5];
//        String countries1[] = new String[5];

        //대입
        countries1[0] = country1;
        countries1[1] = country2;
        countries1[2] = country3;
        countries1[3] = country4;
        countries1[4] = country5;

        System.out.println(countries1[3]); //Austria
//        System.out.println(countries1[5]); //ArrayIndexOutOfBoundsException

        //선언 및 대입
//        String[] countries2 = new String[]
//                {"Hungary", "Croatia", " Slovenia", " Austria", "Czech"};
        String [] countries2 = {"Hungary", "Croatia", "Slovenia", "Austria", "Czech"};

        //수정
        countries2[1] = "Swiss";
        System.out.println(countries2[1]);

        int[] intNum = new int[3];
        intNum[0] = 1;
        intNum[1] = 2;
        intNum[2] = 3;

        double[] doubleNum = {12.34, 23.45, 12.55, 45.87};

        boolean[] boolNum = {true, false, false, true};

    }
}
