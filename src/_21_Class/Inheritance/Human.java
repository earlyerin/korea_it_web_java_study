package _21_Class.Inheritance;
/* 퀴즈
 1. Animal 상속
 2. 부모 생성자를 호출해서 객체 생성과 동시에 속성값을 대입할 수 있도록 생성자 정의
 3. Getter & Setter
 4. move() 메소드 오버라이딩
    => "사람이 두발로 걷습니다."
 5. read(String bookName) 메소드 정의
    => "__이 __을 읽습니다"
 6. getAnimalName => "제 이름은 __입니다."
    getAnimalAge => "올해 제 나이는 __이고, 내년에는 __입니다."
 */
public class Human extends Animal {
    String bookName;

    Human(){
        super();
    }

    Human(String humanName, int humanAge, String bookName){
        super(humanName, humanAge);
        setBookName(bookName);
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookName() {
        return bookName;
    }

    @Override
    public void move() {
        super.move();
        System.out.println("사람이 두발로 걷습니다.");
    }

    @Override
    public String getAnimalName() {
        return "제 이름은 " + super.getAnimalName() + "입니다.";
    }

    @Override
    public int getAnimalAge() {
        System.out.println("올해 제 나이는 " + super. getAnimalAge()
                + "살이고, 내년에는 " + (super.getAnimalAge() + 1) + "살입니다.");
        return 0;
    }

    public void read(String bookName){
        System.out.println(super.getAnimalName() + "이 \"" + getBookName() + "\"을/를 읽습니다.");
    }
}
