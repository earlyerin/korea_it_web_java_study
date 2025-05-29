package _06_String;

public class String02 {
    public static void main(String[] args) {
        String str = "I like music and movie and travel.";

        //특정 문자열을 다른 문자열로 대체
        System.out.println(str.replace(" and", ","));

        //해당 인덱스부터 끝까지 반환
        System.out.println(str.substring(7));
        //시작 인덱스부터 끝 인덱스 - 1 까지 반환
        System.out.println(str.substring(7,12));

        System.out.println(str.indexOf("movie"));
        System.out.println(str.substring(str.indexOf("movie"),str.indexOf(".")));

        str = "    I want to go home.    ";

        //해당 문자열의 시작과 끝의 공백 제거
        System.out.println(str.trim());

        String s1 = "Hello";
        String s2 = "World";
        System.out.println(s1 + s2);
        System.out.println(s1.concat(s2)); //문자를 이어붙여서 반환
        System.out.println(s1 + " " + s2);
        System.out.println(s1.concat(" " + s2));

    }
}
