package _24_Interface;
/*
각 기능을 가진 버튼의 객체를 멤버변수로 선언
모든 버튼의 기능을 통합한 TV 리모콘 구현
 */
public class TvRemoteController {
    //Field
    private PowerButton powerButton;
    private ChannelUpButton channelUpButton;
    private ChannelDownButton channelDownButton;
    private VolumeUpButton volumeUpButton;
    private  VolumeDownButton volumeDownButton;

    //AllArgsConstructor
    public TvRemoteController(PowerButton powerButton, ChannelUpButton channelUpButton, ChannelDownButton channelDownButton, VolumeUpButton volumeUpButton, VolumeDownButton volumeDownButton) {
        this.powerButton = powerButton;
        this.channelUpButton = channelUpButton;
        this.channelDownButton = channelDownButton;
        this.volumeUpButton = volumeUpButton;
        this.volumeDownButton = volumeDownButton;
    }

    //전원 On & Off
    public void onPressedPowerButton(){
        System.out.print("TV의 ");
        powerButton.onPressed();
    }

    //채널 Up & Down
    public void onPressedChannelUpButton(){
        System.out.print("TV의 ");
        channelUpButton.onPressed();
    }
    public void onUpChannelUpButton(){
        System.out.print("TV의 ");
        channelUpButton.onUp();
    }

    public void onPressedChannelDownButton(){
        System.out.print("TV의 ");
        channelDownButton.onPressed();
    }
    public void onDownChannelDownButton(){
        System.out.print("TV의 ");
        channelDownButton.onDown();
    }

    //볼륨 Up & Down
    public void onPressedVolumeUpButton(){
        System.out.print("TV의 ");
        volumeUpButton.onPressed();
    }
    public void onUpVolumeUpButton(){
        System.out.print("TV의 ");
        volumeUpButton.onUp();
    }

    public void onPressedVolumeDownButton(){
        System.out.print("TV의 ");
        volumeDownButton.onPressed();
    }
    public void onDownVolumeDownButton(){
        System.out.print("TV의 ");
        volumeDownButton.onDown();
    }


}
