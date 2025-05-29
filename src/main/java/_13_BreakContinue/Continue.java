package _13_BreakContinue;

public class Continue {
    public static void main(String[] args) {
        /* 반복문
        continue : 현재 반복을 중단하고 다음 반복 실행
         */
        int waiting = 50; //대기 인원
        int max = 20; // 판매 가능 개수
        int sold = 0; // 현재 판매량
        int noShow = 12; // 노쇼 번호

        for (int i = 1; i <= waiting; i++) {
            if(i == noShow){
                System.out.println(i + "번 손님 노쇼");
                continue;
            }

            System.out.println(i + "번 손님 입장");
            sold++;
            if(sold == max){
                System.out.println("재료 소진");
                break;
            }
        }


        sold = 0;
        int nowNum = 1;
        while (nowNum <= waiting) {
            if(nowNum == noShow){
                System.out.println(nowNum + "번 손님 노쇼");
                nowNum++;
                continue;
            }
            System.out.println(nowNum + "번 손님 입장");
            sold++;
            if (sold == max){
                System.out.println("재료 소진");
                break;
            }
            nowNum++;
        }



    }
}
