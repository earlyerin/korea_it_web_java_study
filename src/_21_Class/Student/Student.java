package _21_Class.Student;
/*
학생 정보를 담은 클래스
속성 : 이름, 이메일, 주소
기능 : 정보 출력
 */
public class Student {
    //Field
    String name;
    String email;
    int age;
    String address;

    //Constructor
    public Student() {

    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, String email){
        this.name = name;
        this.email = email;
    }

    public Student(String name, String email, int age){
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public Student(String name, String email, int age, String address){
        this.name = name;
        this.email = email;
        this.age = age;
        this.address = address;
    }

    //Method
    public void showInfo(){
        System.out.println("이름 : "  + name);
        System.out.println("이메일 : " + email);
        System.out.println("나이 : " + age);
        System.out.println("주소 : " + address);
    }
}
