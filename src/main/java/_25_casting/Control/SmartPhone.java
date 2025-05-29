package _25_casting.Control;

public class SmartPhone implements Power{
    @Override
    public void on() {
        System.out.println("스마트폰을 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("스마트폰을 끕니다.");
    }

    public void sendTalk(){
        System.out.println("스마트폰으로 카톡을 보냅니다.");
    }
}