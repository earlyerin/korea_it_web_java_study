package _21_Class.Person;

public class Person {
    public String name; //어디서든 접근 가능
    protected int age;  // 같은 패키지 내에서만 접근 가능
    String address;     // 같은 패키지이거나 자식 클래스이면 접근 가능
    private String id;  //해당 클래스 내부에서만 접근 가능
}
