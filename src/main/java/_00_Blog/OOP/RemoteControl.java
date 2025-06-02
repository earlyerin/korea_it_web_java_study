package _00_Blog.OOP;

public class RemoteControl {
    //Field
    private String device;

    //Constructor
    public RemoteControl(String device) {
        this.device = device;
    }

    //Method
    public void powerOn(){
        System.out.println(device + " 전원 켜기");
    }

    public void powerOff(){
        System.out.println(device + " 전원 끄기");
    }
}

