package _21_Class.WaterBottle;
/* 퀴즈
 변수 : currentWater = 현재 물의 양
 메소드
 1. fill = 물 채우기, 최대용량 1000
 2. drink = 물 마시기, 현재 물의 양을 초과할 수 없다.
 3. getter를 통해 현재 물의 양에 접근할 수 있다.
 */
public class WaterBottle {
    private int currentWater;

    public void fill(int amount) { //물 채우기
        if(amount > 0 && currentWater + amount <= 1000){
            currentWater += amount;
            System.out.println(currentWater + "ml를 담았습니다.");
        }else { System.out.println("용량을 초과했습니다."); }
    }

    public void drink(int amount) { //물 마시기
        if(amount > 0 && currentWater >= amount){
            currentWater -= amount;
            System.out.println(amount + "ml 마셨습니다.");
        }else { System.out.println("남은 양이 부족합니다."); }
    }

    public String getCurrentWater() { //남은 양 확인
        return String.valueOf(currentWater) + "ml 남았습니다.";
    }
}
