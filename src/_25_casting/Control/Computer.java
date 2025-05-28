package _25_casting.Control;

public class Computer implements Power{
    @Override
    public void on() {
        System.out.println("컴퓨터를 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("컴퓨터를 끕니다.");
    }

    public void brightnessControl(int level){
        System.out.println("컴퓨터 밝기를 " + level + "%로 변경");
    }
}
