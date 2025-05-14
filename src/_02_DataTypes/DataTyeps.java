package _02_DataTypes;

public class DataTyeps {
    public static void main(String[] args) { //psvm or main
        System.out.println("hello");
        System.out.println(123);


        /* 변수(재사용성..유지보수..)
        자료형 변수명 = 데이터;
         */

        /* 자료형
        정수 - int, long
         */
        int num1 = 123;
        int num2; //선언
        num2 = 234; //최초값 초기화
        num2 = 456;
        System.out.println("num1은 " + num1);
        System.out.println("num2는 " + num2);

        long l = 10_000_000_000L; //가독성 향상
        System.out.println("l은 " + l);

        /* 자료형
        실수 - float, double
            유효자릿수
            float 7
            double 15-16

            부동소수점의 오류 - 무한소수(가수 23bit까지 저장, 마지막 자리 반올림)

        */
        float f = 3.14f;
        double d = 3.141592243676;

        /* 자료형
        문자 - char
        */
        char c1 = 'a';
        char c2 = 'b';
        System.out.println(c1 + c2); // 아스키코드 값의 합(97 + 98)
        System.out.println("" + c1 + c2); // ab

        /* 클래스
        문자열 - String
        */
        String s = "안녕하세요";
        System.out.println(s);

        /*자료형
        논리 - boolean(true or false)
         */
        boolean isEmpty;
        isEmpty = true;
        isEmpty = false;
        System.out.println(isEmpty);

        /* 퀴즈
        제 이름은 ***입니다. 제 나이는 **살이고
        취미는 ***입니다.
         */
        String name = "이예린";
        int age = 21;
        String  hobby = "독서";
        String MBTI = "ESTP";
        System.out.printf("제 이름은 %s입니다. 제 나이는 %d살이고\n취미는 %s입니다.\n제 MBTI는 %s입니다.",name,age,hobby,MBTI);

    }
}
