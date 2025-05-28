package _26_Objects;

public class Main {
    public static void main(String[] args) {
        /*
        Object
        - 모든 클래스는 Object 클래스를 상속받고 있다.
         */
        Teacher teacher1 = new Teacher("이예린", "코리아IT");
        /*
        toString()
        오버라이딩 전 => _26_Object.Teacher@119d7047
        오버라이딩 후 => 이예린선생님의 근무지는 코리아IT입니다.
         */
        System.out.println(teacher1.toString());

        Teacher teacher2 = new Teacher("이예린", "코리아IT");
        System.out.println(teacher1.hashCode());
        System.out.println(teacher2.hashCode());
        System.out.println(teacher1.equals(teacher2));
        //hashCode가 같아야 equals의 반환값 true
    }
}
