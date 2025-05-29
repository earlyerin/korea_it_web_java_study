package _11_NestedLoop;

public class NestedLoop {
    public static void main(String[] args) {
        /*
        이중반복문
         */
        /*
        네모 별 찍기
        *   *   *   *   *
        *   *   *   *   *
        *   *   *   *   *
        *   *   *   *   *
        *   *   *   *   *
         */
        for (int i = 0; i < 5; i++) { //세로줄
            for (int j = 0; j < 5; j++) { //가로로 별 출력
                System.out.print("*\t");
            }
            System.out.println(); //줄 바꿈
        }

        /*
        별 삼각형 찍기
        *                   (i = 0, j = 0)
        *   *               (i = 1, j = 0) (i = 1, j = 1)
        *   *   *                       ...
        *   *   *   *
        *   *   *   *   *
         */
        System.out.println();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }

        /*
        별 삼각형 찍기
        *   *   *   *   *   (i = 0, j = 5) (i = 0, j = 4) ...
        *   *   *   *       (i = 1, j = 5) ...
        *   *   *
        *   *
        *                   (i = 4, j = 5)
         */
        System.out.println();
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i ; j--) {
                System.out.print("*\t");
            }
            System.out.println();
        }

        /*
        SSSS*
        SSS**
        SS***
        S****
        *****
         */
        System.out.println();
        for (int i = 0; i < 5; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print("S");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
