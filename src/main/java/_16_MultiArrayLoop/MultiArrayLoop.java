package _16_MultiArrayLoop;

import java.util.Arrays;

public class MultiArrayLoop {
    public static void main(String[] args) {
        /*
        for문을 사용한 다차원 배열 순회
         */
        String[][] seats1 = new String[][] {
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(seats1[i][j] + " ");
            }
            System.out.println();
        }

        String[][] seats2 = {
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4", "C5"}
        };
        //seats[0].length => {"A1", "A2", "A3"} : 3
        //seats[1].length => {"B1", "B2", "B3", "B4"} : 4
        for (int i = 0; i < seats2.length; i++) { //행 길이
            for (int j = 0; j < seats2[i].length; j++) { //열 길이
                System.out.print(seats2[i][j] + " ");
            }
            System.out.println();
        }

        //자동 값 대입 구현
        String[][] imaxSeats = new String[10][15];
        String[] eng = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        for (int i = 0; i < imaxSeats.length; i++) {
            for (int j = 0; j < imaxSeats[i].length; j++) {
                imaxSeats[i][j] = eng[i] + (j + 1);
            }
        }

        for (int i = 0; i < imaxSeats.length; i++) {
            System.out.println(Arrays.toString(imaxSeats[i]));
        }

        /* 퀴즈
        다차원 배열 합 구하기
        1. 3 X 3 크기의 이차원 배열에서 1부터 홀수만 차례대로 대입하고 출력
        2. 해당 배열 합 구하기
         */
        int[][] arr = new int[3][3]; //선언
        int odd = 0; //odd = 1
        for (int i = 0; i < arr.length; i++) { //대입
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = 2 * odd + 1; //odd
                odd++; //odd += 2
            }
        }

        for (int i = 0; i < arr.length; i++) { //출력
            System.out.println(Arrays.toString(arr[i]));
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) { //합
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println(sum);


    }
}
