package _06_String;

public class StringCompare {
    public static void main(String[] args) {
        String str1 ="Java";
        String str2 = "Python";

        //비교 연산자 사용 (참조 위치 비교)
        System.out.println(str1 == str2);

        //비교 메서드 사용 (내용 비교)
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals("Java"));

        //대소문자 구분없이 비교
        System.out.println(str2.equalsIgnoreCase("python"));

        //String Literal : String Pool에 저장, 값이 동일한 객체가 존재하면 반환(재사용)
        String password1 = "1234";
        String password2 = "1234";

        System.out.println(password1 == password2); //true : password1과 password2는 같은 공간 참조
        System.out.println(password1.equals(password2)); //true

        //String Object : new 키워드 사용 시 항상 새로운 객체(메모리 공간) 생성
        password1 = new String("1234");
        password2 = new String("1234");

        System.out.println(password1 == password2); //false : password1과 password2는 다른 공간 참조
        System.out.println(password1.equals(password2)); //true
    }
}
