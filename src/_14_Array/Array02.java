package _14_Array;

public class Array02 {
    public static void main(String[] args) {
        /*
        for문을 사용한 배열 순회
         */
        String [] countries = {"Hungary", "Croatia", "Slovenia", "Austria", "Czech"};

        for (int i = 0; i < 5; i++) {
            System.out.println(countries[i]);
        }

        for (int i = 0; i < countries.length; i++) {
            System.out.println("country" + (i + 1) + " : " + countries[i]);
        }

        /*
        향상된 for문(enhanced for, for-each)을 사용한 배열 순회
         */
        for (String country : countries){
            System.out.println(country);
        }
    }
}
