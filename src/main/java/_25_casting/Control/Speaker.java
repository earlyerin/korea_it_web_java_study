package _25_casting.Control;

public class Speaker implements Power{
    @Override
    public void on() {
        System.out.println("스피커를 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("스피커를 끕니다.");
    }

    public void changeVolume(int volume){
        System.out.println("음량을 " + volume + "으로 변경");
    }
}