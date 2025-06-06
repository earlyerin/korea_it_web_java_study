package _00_Blog.OOP;

public class ChannelDownWheelButton extends WheelButton{
    @Override
    public String onPressed() {
        int channelDown = Channel.channel;

        if(channelDown == 1){ channelDown = 100; }
        else { channelDown--; }

        Channel.channel = channelDown;
        return "Channel." + channelDown;
    }

    @Override
    public void OnUp() {

    }

    @Override
    public void OnDown() {

    }
}
