package _06_String;

public class String01 {
    public static void main(String[] args) {
        String str = "My name is Yerin Lee";

        System.out.println(str.length()); //문자열 길이

        System.out.println(str.toUpperCase()); //모두 대문자로 변환
        System.out.println(str.toLowerCase()); //모두 소문자로 변환

        System.out.println(str.contains("name")); //포함 여부 반환(boolean)
        System.out.println(str.contains("age"));

        System.out.println(str.indexOf("name")); //해당 문자의 처음 위치 반환
        System.out.println(str.indexOf("age")); //포함되지 않은 문자의 경우 -1 반환

        str = "I like music and movie and travel";
        System.out.println(str.lastIndexOf("and")); //해당 문자의 마지막 위치 반환
        System.out.println(str.lastIndexOf("java")); //포함되지 않은 문자의 경우 -1 반환

        System.out.println(str.startsWith("I like")); //해당 문자로 시작 여부 반환(boolean)
        System.out.println(str.startsWith("My name"));

        System.out.println(str.endsWith("travel")); //해당 문자로 마침 여부 반환(boolean)
        System.out.println(str.endsWith("movie"));

    }
}
