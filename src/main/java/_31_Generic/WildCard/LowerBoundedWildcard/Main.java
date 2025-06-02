package _31_Generic.WildCard.LowerBoundedWildcard;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Box<Dog> dogBox = new Box<>();
        dogBox.setItem(new Dog());

        Box<Cat> catBox = new Box<>();
        catBox.setItem(new Cat());

        Box<Animal> animalBox = new Box<>();
        animalBox.setItem(new Animal());

        ExtendsWildcard.makeSound(dogBox);
        ExtendsWildcard.makeSound(catBox);
        ExtendsWildcard.makeSound(animalBox);

//        Box<Date> dateBox = new Box<>();
//        dateBox.setItem(new Date());
//
//        ExtendsWildcard.makeSound(dateBox);
//        Animal의 자식클래스가 아니므로 makeSound() 메소드 사용 불가
    }
}
