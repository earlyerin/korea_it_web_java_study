package _00_Blog.OOP;

public class PowerButton { //전원 버튼

    private boolean status = false; //전원 상태

    public String onPressed() { //전원 버튼 누름
        if(status){
            status = false;
            return "Power Off";
        }
        status = true;
        return "Power On";

    }
}
