package _00_Blog.ObjectClass;

public class Car { //자동차
    private String carName;
    private String carColor;
    private String carYear;
    private int carPrice;

    public Car(String carName, String carColor, String carYear, int carPrice) {
        this.carName = carName;
        this.carColor = carColor;
        this.carYear = carYear;
        this.carPrice = carPrice;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carName=" + carName +
                ", carColor=" + carColor +
                ", carYear=" + carYear +
                ", carPrice=" + carPrice +
                '}';
    }
}
