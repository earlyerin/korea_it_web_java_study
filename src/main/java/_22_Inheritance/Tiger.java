package _22_Inheritance;

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

    /*
    *** 오버라이딩 ***
    * - 상속 관계에서 자식 클래스가 부모 클래스의 메소드를 재정의
    * - 부모로부터 물려받은 메소드를 자식이 '다르게' 실행하도록 변경
    *
     */
    /*
    super 키워드
    2. super.메소드명() OR super.필드명() : 부모 클래스의 메소드또는 멤버변수를 호출하는 키워드
     */
    @Override
    public void move() {
        System.out.print(getAnimalName() + "가 ");
        super.move();
    }

    public void hunt(){
        System.out.println(getAnimalName() + "가 사냥을 합니다.");
        /*
        동적 바인딩(Dynamic Binding)
        - 런타임 시 호출될 메소드가 결정되는 것
        - 상속 시 메소드 탐색 순서는 자식 클래스 -> 부모 클래스
          따라서, 부모 클래스의 메소드를 호출하고 싶다면 super 키워드 사용
         */
    }
}
