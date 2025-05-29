package _12_MultipleTable;

public class MultipleTable {
    public static void main(String[] args) {
        /*
        1 ~ 9 단까지 출력
        예) 1 X 3 = 3
         */
        for (int i = 1; i <= 9 ; i++) {
            for (int j = 1; j <= 9 ; j++) {
                System.out.printf("%d X %d = %d\t", i, j, i*j);
            }
            System.out.println();
        }
    }
}
