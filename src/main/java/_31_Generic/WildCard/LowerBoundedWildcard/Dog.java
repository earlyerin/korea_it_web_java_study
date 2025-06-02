package _31_Generic.WildCard.LowerBoundedWildcard;

public class Dog extends Animal{
    @Override
    public void sound() {
        super.sound();
        System.out.println("멍멍");
    }
}
