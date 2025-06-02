package _00_Blog.OOP;

public class Main {
    public static void main(String[] args) {
        RemoteControl TvRemoteControl = new RemoteControl("TV");
        RemoteControl ACRemoteControl = new RemoteControl("Air Conditioning");
        RemoteControl LampRemoteControl = new RemoteControl("Lamp");

        TvRemoteControl.powerOn();
        TvRemoteControl.powerOff();

        ACRemoteControl.powerOn();
        ACRemoteControl.powerOff();

        LampRemoteControl.powerOn();
        LampRemoteControl.powerOff();
    }
}
