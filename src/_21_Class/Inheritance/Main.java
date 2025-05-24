package _21_Class.Inheritance;

public class Main {
    public static void main(String[] args) {
        /*
        상속
        - 기존클래스(부모 클래스)의 속성과 기능을 새로운 클래스(자식 클래스)가 물려받는 것
        - 코드의 재사용성과 계층 구조 설계를 가능하게 해주는 핵심 개념
        - 유지 보수, 즉 '공통 기능'이 부모 클래스에 있으므로 수정할 때 부모 클래스만 수정하여 반영
        - 기존 클래스를 수정하지 않고도 '새로운 기능'을 가진 자식 클래스 추가 가능(개방 폐쇠 원칙)
        *개방 폐쇠 원칙 : 확장에는 열려있고, 수정(변경)에는 닫혀있어야 한다.
        - 자식클래스는 부모의 코드를 그대로 사용하거나 변경(오버라이딩), 필요한 기능을 추가할 수 있다.
         */
        Animal animal = new Animal();
        animal.setAnimalName("야옹");
        animal.setAnimalAge(3);
        animal.move();

        Tiger tiger = new Tiger();

    }
}
