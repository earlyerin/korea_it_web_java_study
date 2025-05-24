package _21_Class.Student;

public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student();

//        s1.name = "rin";
//        s1.email = "rin@gamil.com";
//        s1.age = 21;
//        s1.address = "Ulsan";
//        s1.showInfo();

        s1.setName("rin");
        s1.setEmail("rin@gamil.com");
        s1.setAge(21);
        s1.setAddress("Ulsan");
        System.out.println(s1.getName());
        System.out.println(s1.getEmail());
        System.out.println(s1.getAge());
        System.out.println(s1.getAddress());
        //private 접근제어자로 접근을 제한하여 데이터를 보호 : 캡슐화

        Student s2 = new Student("mimi", "mi@naver.com", 30, "Busan");
        s2.showInfo();
    }
}
