package _00_Blog.OOP;

public class ChannelDownButton extends Button{
    @Override
    public String OnPressed() {
        int channelDown = Channel.channel;

        if(channelDown == 1){
            channelDown = 100;
        }
        channelDown--;
        Channel.channel = channelDown;
        return "Channel." + channelDown;
    }
}
