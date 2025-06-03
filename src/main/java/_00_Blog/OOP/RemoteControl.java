package _00_Blog.OOP;

public class RemoteControl {
    //Field
    private PowerButton powerButton = new PowerButton();
    private ChannelUpButton channelUpButton = new ChannelUpButton();
    private ChannelDownButton channelDownButton = new ChannelDownButton();

    public void power(){
        System.out.println(powerButton.OnPressed());
    }

    public void channelUp(){
        System.out.println(channelUpButton.OnPressed());
    }

    public void channelDown(){
        System.out.println(channelDownButton.OnPressed());
    }




}

