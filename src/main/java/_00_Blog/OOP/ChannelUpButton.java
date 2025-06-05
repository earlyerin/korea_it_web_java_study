package _00_Blog.OOP;

public class ChannelUpButton extends Button { //채널 올림 버튼
    @Override
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

    @Override
    public String enable() {
        return super.enable().replaceAll(super.enable()
                , "enable channel UP button");
    }

    @Override
    public String disable() {
        return super.disable().replaceAll(super.disable()
                , "disable channel UP button");
    }
}
