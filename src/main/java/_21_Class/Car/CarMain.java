package _21_Class.Car;

public class CarMain {
    public static void main(String[] args) {
        System.out.println("------c1------");
        Car c1 = new Car();

        System.out.println("------c2------");
        Car c2 = new Car("Avan");

        System.out.println("------c3------");
        Car c3 = new Car("Santa", 2025, "White");
        System.out.println();

        c1.carName = "Sm";
        c1.carYearModel = 2020;
        c1.carColor = "Black";
        System.out.println("car1 : " + c1.carName + " " + c1.carYearModel + " " + c1.carColor);

        System.out.println("car2 : " + c2.carName + " " + c2.carYearModel + " " + c2.carColor);

        System.out.println("car3 : " + c3.carName + " " + c3.carYearModel + " " + c3.carColor);

        c2.startCar(); //호출하여 사용하므로 메소드의 내부 동작을 알 수 없음 (추상화)
        c2.drive();
        c2.stop();

    }
}
