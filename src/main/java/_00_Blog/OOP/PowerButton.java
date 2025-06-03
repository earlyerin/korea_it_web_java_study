package _00_Blog.OOP;

public class PowerButton extends Button{
    private boolean status = false;
    @Override
    public void OnPressed() {
        if(status){
            status = false;
            System.out.println("Power Off");
        }else {
            status = true;
            System.out.println("Power On");
        }
    }
}
