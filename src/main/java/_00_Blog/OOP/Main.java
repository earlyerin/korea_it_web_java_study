package _00_Blog.OOP;

public class Main {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

//      remoteControl.device = TV;

        remoteControl.setDevice("TV");
        System.out.println(remoteControl.getDevice());

    }
}
