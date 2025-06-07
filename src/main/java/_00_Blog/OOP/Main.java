package _00_Blog.OOP;

public class Main {
    public static void main(String[] args) {

        NewRemoteControl newRemoteControl = new NewRemoteControl();
        newRemoteControl.power();
        newRemoteControl.channelOnDown(97);
        newRemoteControl.channelOnUp(5);
        newRemoteControl.channelOnUp(7);
        newRemoteControl.power();

    }
}
