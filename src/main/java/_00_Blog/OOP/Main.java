package _00_Blog.OOP;

public class Main {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        remoteControl.power();
        remoteControl.channelUp();
        remoteControl.channelUp();
        remoteControl.channelUp();
        remoteControl.fixedChannel();
        remoteControl.channelUp();
        remoteControl.changeableChannel();
        remoteControl.channelDown();
        remoteControl.power();
    }
}
