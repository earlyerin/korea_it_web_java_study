package _21_Class.Student;
/*
학생 정보를 담은 클래스
속성 : 이름, 이메일, 주소
기능 : 정보 출력
 */
public class Student {
    //Field
    private String name;
    private String email;
    private int age;
    private String address;

    /*
    private으로 선언했을 때 값을 대입하는 방법 (변수에 직접 접근 불가능)
    1. 생성자 사용 : 해당 클래스의 생성자를 거쳐서 접근
    2. setter 메서드 사용 : 해당 클래스의 메서드를 거쳐서 접근
    단축키 = Alt + insert
     */

    //1. Constructor
    public Student() { }

    public Student(String name) {
        this.name = name;
    }

    //noArgsConstructor
    public Student(String name, String email){
        this.name = name;
        this.email = email;
    }

    //RequiredArgsConstructor
    public Student(String name, String email, int age){
        this.name = name;
        this.email = email;
        this.age = age;
    }

    //AllArgsConstructor
    public Student(String name, String email, int age, String address){
        this.name = name;
        this.email = email;
        this.age = age;
        this.address = address;
    }

    //2. Setter
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    /*
    private으로 선언했을 때 값을 반환하는 방법 : getter 메서드 사용
     */

    //Getter
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    //Method
    public void showInfo(){
        System.out.println("이름 : "  + name);
        System.out.println("이메일 : " + email);
        System.out.println("나이 : " + age);
        System.out.println("주소 : " + address);
    }
}
