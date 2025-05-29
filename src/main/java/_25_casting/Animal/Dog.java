package _25_casting.Animal;

public class Dog extends Animal {
    @Override
    public void speak() {
        super.speak();
        System.out.println("멍멍");
    }

    public void wagTail(){
        System.out.println("꼬리를 흔든다.");
    }
}
