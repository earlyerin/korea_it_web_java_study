package _23_Abstraction;

public class PhoneFactory extends Factory {
    public PhoneFactory() {
    }

    public PhoneFactory(String name) {
        super(name);
    }

    //추상 클래스를 상속받으면 추상 메소드를 반드시 구현해야 한다.
    @Override
    public void produce(String model) {
        System.out.printf("[%s] 스마트폰을 생산합니다.\n",model);
    }

    @Override
    public void manage() {
        System.out.println(getName() + " 공장을 관리합니다.");
    }
}
