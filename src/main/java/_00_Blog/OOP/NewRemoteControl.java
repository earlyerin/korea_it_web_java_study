package _00_Blog.OOP;

public class NewRemoteControl extends RemoteControl{ //RemoteControl 상속
    private ChannelNewButton channelNewButton = new ChannelNewButton();

    public void channelOnUp(int channel){ //NewRemoteControl 만의 메서드(새로운 기능)
        System.out.println(channelNewButton.onUp(channel));
    }

    public void channelOnDown(int channel){ //NewRemoteControl 만의 메서드(새로운 기능)
        System.out.println(channelNewButton.onDown(channel));
    }
}
