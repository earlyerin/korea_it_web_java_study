package _00_Blog.OOP;

public class PowerButton extends Button{ //Button 상속
    private boolean status = false;

    @Override //메서드 오버라이딩
    public String onPressed() {
        if(status){
            status = false;
            return "Power Off";
        }
        status = true;
        return "Power On";

    }
}
