package _09_For;

public class For {
    public static void main(String[] args) {
        /*
        반복문 for
        형식) for( 선언; 조건; 증감 ) {
                반복될 코드;
             }
        단축키 - fori
         */
        for (int i = 0; i < 10; i++){
            System.out.println("안녕" + i);
        }

        //1 ~ 10 중 짝수만 출력
        for (int i = 1; i <= 10; i++) {
            if(i % 2 == 0) System.out.println(i);
        }

        for (int i = 2; i <= 10; i+=2) {
            System.out.println(i);
        }

        //10부터 1까지 거꾸로 출력
        for (int i = 10; i > 0 ; i--) { System.out.println(i); }


        /* 퀴즈
        1부터 100까지 모두 더한 값 출력
         */
        int sum = 0;
        for (int i = 1; i <= 100 ; i++) {
            sum += i;
        }
        System.out.println(sum);



    }
}
