package _25_casting.Animal;

public class Main1 {
    public static void main(String[] args) {
        /*
        UpCasting(업캐스팅)
        - 자식 클래스의 객체를 부모 클래스 타입으로 "참조"하는 것
          즉, 자식 클래스의 인스턴스(객체)를 부모 클래스 타입의 변수에 저장하는 것
        - Java에서의 업캐스팅은 다형성을 구현하는 핵심 개념
         */

        Dog d1 = new Dog();
        d1.speak();
        d1.wagTail();

        //UpCasting 방법1 (자식 => 부모) 형변환 생략 가능 : a는 Animal 타입이지만, 내부적으로는 Dog의 객체가 들어있다.
        Animal a1 = new Dog();
        a1.speak(); //동적 바인딩으로 자식 클래스에서 오버라이딩한 메소드 호출
//        a.wagTail(); //Animal을 참조하므로 자식클래스의 고유 메소드 호출 불가

        //DownCasting 방법1 (부모 => 자식) 형변환 명시 : 일시적으로 형변환하여 자식 클래스의 고유 메소드 호출
        ((Dog)a1).wagTail();

        //UpCasting 방법2 : 부모 타입의 객체에 자식클래스 객체 대입
        Animal a2 = d1;
        a2.speak();

        //DownCasting 방법2 : 자식클래스를 참조하도록 부모클래스의 객체 형변환
        Dog d2 = (Dog) a2;
        d2.speak();
        d2.wagTail();

        /*
        자료형 다형성 : 다양한 자식들을 하나의 클래스 타입으로 처리 가능
         */
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

        Dog[] dogs = { //객체 배열
                dog1,
                dog2,
                dog3
        };

        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal tiger = new Tiger();

        Animal[] animals = { //부모 클래스를 참조하므로 하나의 배열에 모든 자식클래스 타입 묶음 가능
                dog,
                cat,
                tiger
        };

        for (Animal a : animals){
           a.speak();
        }


    }
}
