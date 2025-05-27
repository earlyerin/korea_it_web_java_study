package _23_Abstraction;
/*
추상 클래스(abstract class) : 추상적인, 형태만 있는
- 기능을 정의만 한 클래스, 설계 일관성과 확장성을 확보(공통된 구조를 가진 자식 클래스들을 설계)
- 오류 방지 / 강제 구현 => 추상 메서드를 구현하지 않으면 에러 발생(필수 기능 구현 누락 방지)
- 코드 재사용성 => 공통 메소드나 필드를 추상 클래스에 미리 작성
- 추상 클래스의 객체는 생성 불가
 */
public abstract class Factory {
    private String name;

    public Factory() {
    }

    public Factory(String name) {
        this.name = name;
    }

    //추상 메소드
    public abstract void produce(String model);
    public abstract void manage();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayInfo(){
        System.out.println("공장 정보를 출력합니다.");
        System.out.println("공장이름 : " + getName());
    }
}
