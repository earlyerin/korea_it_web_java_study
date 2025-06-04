package _00_Blog.OOP;

public class ChannelDownButton { //채널 내림 버튼

    public String OnPressed() {
        int channelDown = Channel.channel;

        if(channelDown == 1){
            channelDown = 100; //경계값 처리
        }else {
            channelDown--; //채널 내림
        }

        Channel.channel = channelDown;
        return "Channel." + channelDown;
    }
}
