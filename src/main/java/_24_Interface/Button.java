package _24_Interface;
/*
extends => 단일 상속(다중 상속 불가) : 클래스, 추상 메소드
implements => 다중 상속 가능 : 인터페이스

Button은 Press, Up, Down 기능을 가지므로
인터페이스를 다중 상속하여 메소드 구현
 */
public abstract class Button implements Press, Up, Down{

    /*
    공통적인 기능 : onPressed
    button 클래스를 상속하는 모든 클래스는 onPressed를 항상 재정의를 해야하므로
    추상 메소드로 선언
     */
    @Override
    public abstract void onPressed();

    /*
    Down 또는 Up 기능은 둘 중에 선택하여 구현하므로
    추상 메서드로 선언하지 않음
     */
    @Override
    public void onUp() {

    }

    @Override
    public void onDown(){

    }
}
