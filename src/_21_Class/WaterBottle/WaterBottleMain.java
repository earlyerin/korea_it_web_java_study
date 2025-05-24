package _21_Class.WaterBottle;

public class WaterBottleMain {
    public static void main(String[] args) {
        WaterBottle waterBottle = new WaterBottle();

        waterBottle.fill(500);
        waterBottle.fill(1000);

        waterBottle.drink(700);
        waterBottle.drink(235);

        System.out.println(waterBottle.getCurrentWater());
    }
}
