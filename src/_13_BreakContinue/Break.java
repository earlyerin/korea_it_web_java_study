package _13_BreakContinue;

public class Break {
    public static void main(String[] args) {
        /* 반복문
        break : 특정 상황(조건)에서 반복문을 빠져나옴
         */
        //웨이팅이 현재 50명, 판매 가능한 개수 10개
        int waiting = 50;
        int max = 10;

        for (int i = 1; i <= waiting; i++) {
            System.out.println(i + "번 손님 입장");
            if(i == max){
                System.out.println("재료 소진");
                break;
            }
        }
        System.out.println("영업 종료");

        int nowNum = 1;
        while (nowNum <= waiting){
            System.out.println(nowNum + "번 손님 입장");
            if (nowNum == max){
                System.out.println("재료 소진");
                break;
            }
            nowNum++;
        }
    }
}
