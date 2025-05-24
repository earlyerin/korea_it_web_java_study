package _21_Class.Inheritance;

public class Tiger extends Animal{ //Animal 클래스 상속
    /*
    Animal : 부모 클래스, 슈퍼 클래스
    Tiger : 자식 클래스, 서브 클래스
     */
    //Field
    private boolean isStriped;

    //Constructor
    Tiger() {
        System.out.println("속성이 정해지지 않은 호랑이 객체 생성");
    }
    /*
    super 키워드
    1. super() : 부모 클래스의 생성자를 호출하는 키워드
     */
    public Tiger(String animalName, int animalAge, boolean isStriped) {
        super(animalName, animalAge);
        this.isStriped = isStriped;
        System.out.println("모든 속성값이 부여된 호랑이 객체 생성");
    }

    //Setter
    public void setStriped(boolean striped) {
        isStriped = striped;
    }

    //Getter
    public boolean isStriped() {
        return isStriped;
    }
}
