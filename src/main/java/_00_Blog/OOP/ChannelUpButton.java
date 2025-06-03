package _00_Blog.OOP;

public class ChannelUpButton extends Button{
    @Override
    public String OnPressed() {
        int channelUp = Channel.channel;

        if(channelUp == 100){
            channelUp = 1;
        }
        channelUp++;
        Channel.channel = channelUp;
        return "Channel." + channelUp;
    }
}
