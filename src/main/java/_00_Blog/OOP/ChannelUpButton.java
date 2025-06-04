package _00_Blog.OOP;

public class ChannelUpButton { //채널 올림 버튼
    public String OnPressed() {
        int channelUp = Channel.channel;

        if(channelUp == 100){
            channelUp = 1; //경계값 처리
        }else {
            channelUp++; //채널 올림
        }

        Channel.channel = channelUp;
        return "Channel." + channelUp;
    }
}
