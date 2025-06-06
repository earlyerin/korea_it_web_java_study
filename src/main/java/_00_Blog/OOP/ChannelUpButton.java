package _00_Blog.OOP;

public class ChannelUpButton extends Button{ //Button 상속
    @Override //메서드 오버라이딩
    public String onPressed() {
        if(!super.isEnable){ //채널이 고정된 상태일 경우
            return "Need to unlock.."; //반환값
        }

        int channelUp = Channel.channel;

        if(channelUp == 100){ channelUp = 1; }
        else { channelUp++; }

        Channel.channel = channelUp;
        return "Channel." + channelUp;
    }
}
