package _31_Generic.WildCard.UpperBoundedWildcard;

public class Main {
    public static void main(String[] args) {
        Box<Animal> animalBox = new Box<>();
        SuperWildcard.putDog(animalBox);

        Box<Dog> dogBox = new Box<>();
        SuperWildcard.putDog(dogBox);

//        Box<Maltese> malteseBox = new Box<>();
//        SuperWildcard.putDog(malteseBox);

    }
}
