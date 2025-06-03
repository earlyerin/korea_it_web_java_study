package _00_Blog.OOP;

public class RemoteControl {
    //Field
    private String device;
    private boolean status;

    //Constructor
    public RemoteControl(String device) {
        this.device = device;
    }

    public String powerButton(){
        if(status){
            status = false;
            return device + " 전원 끄기";
        }
        status = true;
        return device + " 전원 켜기";
    }
}

