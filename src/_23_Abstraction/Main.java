package _23_Abstraction;

public class Main {
    public static void main(String[] args) {
        PhoneFactory phoneFactory = new PhoneFactory(); //구현 클래스 객체
        phoneFactory.setName("Apple");
        phoneFactory.produce("iphone16");
        phoneFactory.manage();
        phoneFactory.displayInfo();

        /*
        익명 클래스
        - 객체 생성과 동시에 오버라이딩하여 구현
        - 추상 클래스명으로 익명 클래스를 선언하여 이름 없는 자식 클래스의 객체를 임시로 생성
         */
        Factory factory = new Factory("LG") {
            @Override
            public void produce(String model) {
                System.out.printf("잠깐 만들어진 익명클래스가 [%s]을 생산합니다.\n",model);
            }

            @Override
            public void manage() {
                System.out.println("잠깐 만들어진 익명클래스가 " + getName() + " 공장을 관리합니다.");
            }
        };

        factory.produce("phone");
        factory.manage();

        TabletFactory tabletFactory = new TabletFactory("Apple");
        tabletFactory.manage();
        tabletFactory.produce("아이패드 6세대");
        tabletFactory.upgrade("아이패드 6세대");
    }
}
