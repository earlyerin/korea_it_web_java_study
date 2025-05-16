package _05_Operator;

public class Operator {
    public static void main(String[] args) {
        /*
        연산자 (Operator)
         */
        //대입 연산자(변수에 해당 값을 대입)
        int num1 = 10;
        int num2 = 5;

        //산술 연산자
        System.out.println(num1 + num2); //합
        System.out.println(num1 - num2); //차
        System.out.println(num1 * num2); //곱
        System.out.println(num1 / num2); //몫
        System.out.println(num1 % num2); //나머지

        //복합 대입 연산자
        num1 += 5; // num1 = num1 + 5; => 15
        System.out.println(num1);
        num1 -= 5; // num1 = num1 - 5; => 10
        System.out.println(num1);
        num1 *= 2; // num1 = num1 * 2; => 20
        System.out.println(num1);
        num1 /= 2; // num1 = num1 / 2; => 10
        System.out.println(num1);
        num1 %= 2; //num1 = num % 2; => 0
        System.out.println(num1);

        //증감 연산자
        int j = 10;
        System.out.println(j);
        System.out.println(j++); //후위 증가
        System.out.println(j);
        System.out.println(j--); //후위 감소
        System.out.println(j);
        System.out.println(++j); //전위 증가
        System.out.println(--j); //전위 감소

        //비교 연산자(참 또는 거짓을 반환)
        num1 = 5;
        num2 = 3;
        System.out.println(num1 > num2); //num1이 num2보다 큰가?
        System.out.println(num1 >= num2); //num1이 num2보다 크거나 같은가?
        System.out.println(num1 < num2); //num1이 num2보다 작은가?
        System.out.println(num1 <= num2); //num1이 num2보다 작거나 같은가?
        System.out.println(num1 == num2); //num1이 num2와 같은가?
        System.out.println(num1 != num2); //num1이 num2와 같지 않은가?

        //논리 연산자(&, |, !)
        boolean flag1 = true;
        boolean flag2 = false;
        System.out.println(flag1 & flag2); // and(논리곱) : 하나라도 false이면 false
        System.out.println(flag1 | flag2); // or(논리합) : 하나라도 true이면 true
        System.out.println(flag2 | flag2);
        System.out.println(!flag1); // not(부정)

        //논리 연산자 조합(&& , ||)
        //&& : 선조건이 ture일 때만 후조건 실행
        //|| : 선조건이 false일 때만 후조건 실행
        System.out.println(flag1 && flag2);
        System.out.println(flag1 || flag2);

        //삼항 연산자(조건문의 축약)
        int x = 5;
        int y = 3;
        int max = (x > y)? x : y;
        System.out.println(max);
        int min = (x > y)? y : x;
        System.out.println(min);

        x = 3;
        boolean isSame = (x == y)? true : false;
        System.out.println(isSame);

        String sameStr = (x != y)? "false" : "true";
        System.out.println(sameStr);

        /* 퀴즈
        int height = 숫자;
        키가 120 이상인 경우 탑승이 가능하도록 삼항연산자를 사용하여 구현
        가능하면 "탑승 가능" 불가능하면 "탑승 불가능"
         */
        int height = 100;
        String boardingProcedure = (height >= 120)? "탑승 가능" : "탑승 불가능";
        System.out.println(boardingProcedure);






    }
}
