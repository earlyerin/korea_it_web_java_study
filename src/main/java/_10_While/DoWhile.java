package _10_While;

public class DoWhile {
    public static void main(String[] args) {
        /*
        조건문 do-while : 일단 한 번 실행 후 조건 검사
                         즉, 조건에 상관없이 무조건 한 번은 실행
        형식) do {
                반복될 코드
             } while( 조건 );
         */

        int i = 1;
        i = 10;
        do {
            System.out.println(i);
            i++;
        }while (i <= 5);

    }
}
