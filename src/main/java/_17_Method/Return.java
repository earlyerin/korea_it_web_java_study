package _17_Method;

public class Return {
    /*
    return 반환값;
    void : 반환값이 없다
     */
    public static String getName() {
        String name = "이예린";
        return name;
    }

    public static int getAge() {
        int age = 21;
        return age;
    }

    public static void main(String[] args) {
        System.out.println(getName());
        System.out.println(getAge());

        String myName = getName();
        System.out.println(myName);

        int myAge = getAge();
        System.out.println(myAge);
    }
}
