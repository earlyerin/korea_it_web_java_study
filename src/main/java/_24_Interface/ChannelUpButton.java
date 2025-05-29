package _24_Interface;
/*
up 버튼 한번 - onPressed
up 버튼 지속 - onUp
 */
public class ChannelUpButton extends Button{

    @Override
    public void onPressed() {
        System.out.println("채널을 한 칸 올립니다.");
    }

    @Override
    public void onUp() {
        System.out.println("채널을 계속 올립니다.");
    }
}
