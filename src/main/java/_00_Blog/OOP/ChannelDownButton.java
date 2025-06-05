package _00_Blog.OOP;

public class ChannelDownButton extends Button{ //채널 내림 버튼
    @Override
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

    @Override
    public String enable() {
        return super.enable().replaceAll(super.enable()
                , "enable channel DOWN button");
    }

    @Override
    public String disable() {
        return super.disable().replaceAll(super.disable()
                , "disable channel DOWN button");
    }
}
