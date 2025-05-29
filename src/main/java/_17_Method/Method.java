package _17_Method;

public class Method {
    /*
     메소드 : 기능을 담당하는 부분
     */
    public static void sayHello() { //sayHello라는 이름의 메소드
        System.out.println("안녕"); //기능 : 안녕을 출력
    }

    public static void main(String[] args) {
        System.out.println("메소드 호출 전");
        sayHello(); //메소드 호출
        System.out.println("메소드 호출 후");
    }
}
