package _00_Blog.OOP;

public abstract class Button {

    public abstract String onPressed(); //버튼 누름(추상 메서드)

    public static boolean isEnable = true;
    public String  enable(){ //버튼 활성화(인스턴스 메서드)
        isEnable = true;
        return "enable button";
    }

    public String disable(){ //버튼 비활성화(인스턴스 메서드)
        isEnable = false;
        return "disable button";
    }
}
