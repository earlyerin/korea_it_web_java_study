package _25_casting.Control;

public class Tv implements Power{
    @Override
    public void on() {
        System.out.println("TV를 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("TV를 끕니다.");
    }

    public void changeChannel(int channel){
        System.out.println(channel + "번 채널으로 이동합니다.");
    }
}
