package _25_casting.Control;

public class LEDLight implements Power{
    private int colorLevel;
    private int count = 1;

    @Override
    public void on() {
        System.out.println("LED를 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("LED를 끕니다.");
    }

    public void changeColor(){
        colorLevel = count;
        if(colorLevel == 1){
            System.out.println("LED를 백색으로 변경합니다.");
            count++;
        } else if (colorLevel == 2) {
            System.out.println("LED를 황색으로 변경합니다.");
            count++;
        } else if (colorLevel == 3){
            System.out.println("LED를 청색으로 변경합니다.");
            count = 1;
        }


    }
}