package _25_casting.Animal;

public class Main2 {
    public static void main(String[] args) {
        /*
        instanceOf
        형식) 객체 instanceOf 클래스명
        - 확인하고자 하는 객체가 해당 클래스의 인스턴스이거나 자식클래스의 인스턴스이면 true
         */
        Dog dog1 = new Dog();
        Animal animal1 = new Dog();

        boolean result1 = animal1 instanceof Animal;
        System.out.println(result1); //true

        boolean result2 = animal1 instanceof Dog;
        System.out.println(result2); //true
        //부모 클래스를 참조하지만 자식 클래스의 객체이므로

        boolean result3 = dog1 instanceof Dog;
        System.out.println(result3); //true

        boolean result4 = dog1 instanceof Animal;
        System.out.println(result4); //true

        //잘못된 형변환으로 인한 ClassCastException 예외를 방지하기 위해 사용
        Animal animal2 = new Dog(); //업캐스팅
        System.out.println("animal2 검증");
        if(animal2 instanceof Dog){ //true
            Dog dog2 = (Dog) animal2;
            dog2.speak();
            dog2.wagTail();
        }

        Animal animal3 = new Animal();
        System.out.println("animal3 검증");
        if(animal3 instanceof Dog){ //false
            Dog dog3 = (Dog) animal3;
            dog3.speak();
            dog3.wagTail();
        }else {
            System.out.println("animal3는 Dog 클래스의 인스턴스가 아니다.");
        }
    }
}
