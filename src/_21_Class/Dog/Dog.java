package _21_Class.Dog;
/*
강아지에 대한 속성과 기능을 정의한 클래스(설계도면)
 */
public class Dog {

    //Field : 속성
    String name;
    int age;

    //Method : 기능
    public void bark(){
        System.out.println("멍멍");
    }

    public void sleep() {
        System.out.println("잠자기");
    }
}
