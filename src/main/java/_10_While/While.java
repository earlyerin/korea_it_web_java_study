package _10_While;

public class While {
    public static void main(String[] args) {
        /*
        반복문 while : 조건이 참일 경우 계속 반복
        형식) while( 조건 ) {
                반복할 코드
             }
        for VS while
        for문 - 횟수 중심
        while문 - 조건 중심
        */

        //1 ~ 5 출력
        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }

        //10 ~ 1 출력
        i = 10;
        while (i >= 1) {
            System.out.println(i);
            i--;
        }

        //1 ~ 10 중 짝수만 출력
        i = 1;
        while (i <= 10){
            if(i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }

        //1 ~ 100 누적합
        i = 1;
        int sum = 0;
        while (i <= 100){
            sum += i;
            i++;
        }
        System.out.println(sum);


    }
}
