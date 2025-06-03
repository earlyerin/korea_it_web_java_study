package _00_Blog.OOP;

public class PowerButton extends Button{
    private boolean status = false;
    @Override
    public String OnPressed() {
        if(status){
            status = false;
            return "Power Off";
        }
        status = true;
        return "Power On";

    }
}
