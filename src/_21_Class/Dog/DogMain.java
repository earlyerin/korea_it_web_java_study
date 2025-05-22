package _21_Class.Dog;

public class DogMain {
    public static void main(String[] args) {
        //객체 생성
        Dog myDog = new Dog();

        //생성된 해당 객체 속성 값 대입 또는 변경
        myDog.age = 7;
        myDog.name = "호두"; //대입
        myDog.name = "가을이"; //변경

        System.out.println(myDog.name + "는 " + myDog.age + "살!!!");

        //생성된 객체 메소드 호출
        myDog.bark();
        myDog.sleep();
    }
}
