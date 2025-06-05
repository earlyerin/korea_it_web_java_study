package _00_Blog.OOP;

public abstract class Button implements Press {
    @Override
    public abstract String OnPressed();

    private boolean enable = true;
    public String  enable(){ //버튼 활성화
        if(enable){
            return "enable button";
        }
        enable = true;
        return "enable button";
    }

    public String disable(){ //버튼 비활성화
        if(enable) {
            enable = false;
            return "disable button";
        }
        return "disable button";
    }


}
