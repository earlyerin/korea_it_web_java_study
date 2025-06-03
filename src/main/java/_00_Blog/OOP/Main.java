package _00_Blog.OOP;

public class Main {
    public static void main(String[] args) {
        RemoteControl TvRemoteControl = new RemoteControl("TV");
        RemoteControl LampRemoteControl = new RemoteControl("Lamp");

        System.out.println(TvRemoteControl.powerButton());
        System.out.println(TvRemoteControl.powerButton());

        System.out.println(LampRemoteControl.powerButton());
        System.out.println(LampRemoteControl.powerButton());
    }
}
