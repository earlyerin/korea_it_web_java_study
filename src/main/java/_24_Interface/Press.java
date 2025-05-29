package _24_Interface;

public interface Press {
    /*
    인터페이스
    - 기능(메소드)의 명세(규칙,약속)만 정의하는 틀
    - 모든 변수는 public static final로 선언(상수)
    - 객체 생성 불가, 생성자 없음
    - 기능 중심 설계, 여러 클래스에서 같은 기능을 다르게 구현할 때 사용
    - 다중 상속 가능
     */
//    public static final String NAME = "button";

    void onPressed(); //abstract 생략, 추상 메소드

}
