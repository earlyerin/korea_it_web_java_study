package _00_Blog.OOP;

public class RemoteControl {
    private PowerButton powerButton = new PowerButton();
    private ChannelUpButton channelUpButton = new ChannelUpButton();
    private ChannelDownButton channelDownButton = new ChannelDownButton();

    public void power(){
        System.out.println(powerButton.onPressed());
    }
    public void channelUp(){
        System.out.println(channelUpButton.onPressed());
    }
    public void channelDown(){
        System.out.println(channelDownButton.onPressed());
    }

    public void fixedChannel(){
        System.out.println(powerButton.disable());
    }

    public void changeableChannel(){
        System.out.println(powerButton.enable());
    }
}

