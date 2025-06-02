package _31_Generic.WildCard.UnBoundedWildcard;

public class Main {
    public static void main(String[] args) {
        Box<String> StringBox = new Box<>();
        StringBox.setItem("Hello");

        Box<Integer> IntegerBox = new Box<>();
        IntegerBox.setItem(1234);

        UnBoundedWildcard.printBox(StringBox);
        UnBoundedWildcard.printBox(IntegerBox);
    }
}
