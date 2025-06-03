package _31_Generic.WildCard.LowerBoundedWildcard;

public class ExtendsWildcard {
    /*
    상한 경계 와일드카드(상위 클래스 제한)
    <? extends 클래스명>
    ex) <? extends Animal>
    해당 클래스를 포함하여 상속한 모든 타입을 받을 수 있다.
    하지만 타입이 명확하지 않기 때문에 읽기만 가능, 쓰기는 불가능
    반환 타입은 작성한 클래스로 취급
     */
    public static void makeSound(Box<? extends Animal> box){ //Animal과 Animal을 상속한 타입만 받음
        Animal animal = box.getItem(); //업캐스팅
        animal.sound();

//        box.setItem(new Dog()); => Box<? extends Animal> 또한 타입이 명확하지 않기 때문에 Setter 불가능
    }


}
