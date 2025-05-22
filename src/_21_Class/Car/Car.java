package _21_Class.Car;
/*
자동차 클래스
 */
public class Car {
    //Field
    String carName;
    int carYearModel;
    String carColor;

    //Constructor
    Car(){ //기본 생성자
        System.out.println("필드가 아무것도 정해지지 않은 껍데기 자동차");
        System.out.println("NoArgsConstructor"); //속성이 부여되지 않은 경우 (StringBoot 용어)
    }

    Car(String carNm){ //생성자 오버로딩
        System.out.println("carName의 속성값이 부여된 자동차");
        System.out.println("RequiredArgsConstructor"); //생성자에 속성이 하나라도 부여된 경우
        this.carName = carNm; //this 키워드, 클래스의 속성을 의미 (일반적으로 속성명과 매개변수명 일치)
    }

    Car(String carNm, int carYM, String carC){
        System.out.println("모든 속성값이 부여된 자동차");
        System.out.println("AllArgsConstructor"); //생성자에 모든 속성이 부여된 경우
        this.carName = carNm;
        this.carYearModel = carYM;
        this.carColor = carC;
    }

    //Method
    public void startCar() {
        System.out.println(carName + "의 시동을 겁니다.");
    }

    public void drive() {
        System.out.println(carName + "이 전진합니다.");
    }

    public void stop() {
        System.out.println(carName + "이 정지합니다.");
    }

}
