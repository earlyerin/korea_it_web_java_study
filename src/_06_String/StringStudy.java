package _06_String;

public class StringStudy {
    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = new String("Java");

        String literalStr1 = "Hello World";
        String literalStr2 = "Hello World";

        System.out.println(literalStr1 == literalStr2); // true

        String constructorStr1 = new String("Hello World");
        String constructorStr2 = new String("Hello World");

        System.out.println(constructorStr1 == constructorStr2); // false



    }
}
