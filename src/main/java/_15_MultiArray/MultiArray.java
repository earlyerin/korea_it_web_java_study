package _15_MultiArray;

import java.util.Arrays;

public class MultiArray {
    public static void main(String[] args) {
        /*
        다차원 배열 (2차원 배열) : 실무보단 코딩테스트에서..
         */
        //
        /*
        영화관 좌석
        A1 ~ A5
        B1 ~ B5
        C1 ~ C5
         */
        String[] seatA = {"A1", "A2", "A3", "A4", "A5"};
        String[] seatB = {"B1", "B2", "B3", "B4", "B5"};
        String[] seatC = {"C1", "C2", "C3", "C4", "C5"};
        System.out.println(Arrays.toString(seatA));
        System.out.println(Arrays.toString(seatB));
        System.out.println(Arrays.toString(seatC));

//        String[][] seats1 = new String[3][5];
        String[][] seats1 = new String[][] {
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"},
                {"C1", "C2", "C3", "C4", "C5"}
        };
        System.out.println(seats1[1][2]); //B3
        System.out.println(seats1[2][3]); //C4
        System.out.println(Arrays.deepToString(seats1));

        //1행 3열, 2행 4열, 3행 5열;
        String[][] seats2 = {
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4", "C5"}
        };
        System.out.println(seats2[1][1]); //B2

        //삼차원 배열
        String[][][] multiArray = new String[][][] {
                {{},{},{}},
                {{},{},{}},
                {{},{},{}}
        };

    }
}
