package _00_Blog.OOP;

public class NewRemoteControl {
    private Button button1 = new PowerButton(); //업캐스팅
    private ChannelNewButton channelNewButton = new ChannelNewButton();

    //기존에 구현한 메서드 호출
    public void power(){ System.out.println(button1.onPressed()); }
    public void fixedChannel(){ System.out.println(button1.disable()); }
    public void changeableChannel(){ System.out.println(button1.enable()); }

    //새로운 기능
    public void channelOnUp(int channel){
        System.out.println(channelNewButton.onUp(channel));
    }
    public void channelOnDown(int channel){
        System.out.println(channelNewButton.onDown(channel));
    }
}
