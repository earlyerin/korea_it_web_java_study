package _08_SwitchCase;

public class SwitchCase {
    public static void main(String[] args) {
        /*
        조건문 switch
        형식) switch (표현식){
            case 값1 :
                표현식과 값1이 일치할 경우 수행
                break;
            case 값2:
                표현식과 값2가 일치할 경우 수행
                break;
            default:
                위의 어떤 case에도 해당하지 않을 경우 수행
        }
         */

        /*
        1등 : 전액 장학금
        2등 : 반액 장학금
        3등 : 소정의 상품
        그 이하 : 박수
         */
        int ranking = 2;

        System.out.println("----------if----------");
        if(ranking == 1) System.out.println("Full Scholarship");
        else if (ranking == 2) System.out.println("Half Price Scholarship");
        else if (ranking == 3) System.out.println("Prescribed Product");
        else System.out.println("Clap!!");
        System.out.println("End of Award~");

        System.out.println("---------switch---------");
        switch (ranking){
            case 1 :
                System.out.println("Full Scholarship");
                break;
            case 2:
                System.out.println("Half Price Scholarship");
                break;
            case 3:
                System.out.println("Prescribed Product");
                break;
            default:
                System.out.println("Clap!!");
        }
        System.out.println("End Of Award~");

        /*
        1등 : 전액 장학금
        2등 : 반액 장학금
        3등 : 반액 장학금
        그 이하 : 박수
         */
        switch (ranking){
            case 1 :
                System.out.println("Full Scholarship");
                break;
            case 2:
            case 3:
                System.out.println("Half Price Scholarship");
                break;
            default:
                System.out.println("Clap!!");
        }
        System.out.println("End Of Award~");

        /*
        1등급 10000원
        등급이 한 단계씩 낮아질수록 -1000원
         */
        int price = 7000;
        int grade = 1;
        switch (grade){
            case 1 :
                price += 3000;
                break;
            case 2 :
                price += 2000;
                break;
            case 3 :
                price += 1000;
                break;
        }
        System.out.println("Price : " + price);

        price = 7000;
        switch (grade){
            case 1 :
                price += 1000;
            case 2 :
                price += 1000;
            case 3 :
                price += 1000;
        }
        System.out.println("Price : " + price);

        /* 퀴즈
        switch문을 사용하여 계절 출력
        봄 : 3,4,5월
        여름 : 6,7,8월
        가을 : 9,10,11 월
        겨울 : 12,1,2 월
         */
        int month = 10;
        switch (month){
            case 3,4,5 -> System.out.println("Spring");
            case 6,7,8 ->  System.out.println("Summer");
            case 9,10,11 -> System.out.println("Autumn");
            case 12,1,2 -> System.out.println("Winter");
            default -> System.out.println("Invalid Input");
        }

        /*퀴즈
        1 - 월
        2 - 화
         ...
        7 - 일
        */
        int date = 3;
        switch (date){
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4 :
                System.out.println("Thursday");
                break;
            case 5 :
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;
            case 7 :
                System.out.println("Sunday");

        }
    }
}
