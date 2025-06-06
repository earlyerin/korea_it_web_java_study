package _00_Blog.OOP;

public class ChannelDownButton extends Button{ //Button 상속
    @Override //메서드 오버라이딩
    public String onPressed() {
        if(!super.isEnable){ //채널이 고정된 상태일 경우
            return "disable button"; //반환값
        }

        int channelDown = Channel.channel;

        if(channelDown == 1){ channelDown = 100; }
        else { channelDown--; }

        Channel.channel = channelDown;
        return "Channel." + channelDown;
    }
}
