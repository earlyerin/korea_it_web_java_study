package _21_Class.Student;

public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.name = "rin";
        s1.email = "rin@gamil.com";
        s1.age = 21;
        s1.address = "Ulsan";

        s1.showInfo();

        Student s2 = new Student("mimi", "mi@naver.com", 30, "Busan");
        s2.showInfo();
    }
}
