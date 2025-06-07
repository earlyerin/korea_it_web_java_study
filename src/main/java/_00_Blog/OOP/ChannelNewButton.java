package _00_Blog.OOP;

public class ChannelNewButton extends NewButton{
    @Override
    public String onUp(int channel) {
        if (!Button.isEnable){ return "Need to unlock.."; }

        int changing = Channel.channel; //지나가고 있는 채널
        int changeNum = (Channel.channel < channel) ?
                channel - Channel.channel : channel + (100 - Channel.channel); //이동 횟수

        for (int i = 1; i <= changeNum; i++) {
            if(changing == 100){ changing = 1; } //경계값 처리
            else{ changing++; }

            //버튼을 위로 누르는 동안 이동중이라는 것을 시각화
            System.out.printf("moving from %d to %d : Channel.%03d"
                    ,Channel.channel,channel,changing);
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        Channel.channel = channel;
        return "Completed moving to Channel." + Channel.channel;
    }

    @Override
    public String onDown(int channel) {
        if (!Button.isEnable){ return "Need to unlock.."; }

        int changing = Channel.channel; //지나가고 있는 채널
        int changeNum = (Channel.channel > channel) ?
                Channel.channel - channel : Channel.channel + (100 - channel); //이동 횟수

        for (int i = 1; i <= changeNum; i++) {
            if(changing == 1){ changing = 100; } //경계값 처리
            else{ changing--;}

            //버튼을 아래로 누르는 동안 이동중이라는 것을 시각화
            System.out.printf("moving from %d to %d : Channel.%03d"
                    ,Channel.channel,channel,changing);
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        Channel.channel = channel;
        return "Completed moving to Channel." + Channel.channel;
    }
}
