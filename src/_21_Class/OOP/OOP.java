package _21_Class.OOP;

import _21_Class.Person.Person;

public class OOP {
    public static void main(String[] args) {
        /*
        OOP : Object Oriented Programing : 객체 지향 프로그래밍
        - 현실 세계의 개념을 코드로 표현
        - 사람, 동물, 자동차 등을 하나의 객체로 보는 것
        - 상태(속성)과 동작(기능)을 중심으로 프로그래밍
         */

        /*
        **** OOP의 4가지 원칙 ****
        * 1. 추상화(Abstraction) : 복잡한 내부 동작은 감추고, 꼭 필요한 기능만 보여주는 것
        * 2. 캡슐화 : 정보 은닉, 데이터(변수)를 보호하고, 접근을 제한하여 안정성을 높이는 것
        * 3. 상속 : 기존클래스(부모 클래스)의 속성과 기능을 새로운 클래스(자식 클래스)가 물려받는 것
        * 4. 다형성
         */

        /*
        접근제어자
        - public : 접근 제한 없음
        - default : 같은 패키지 내에서만 접근 가능 (명시하지 않을 시 default)
        - protected : 같은 패키지이거나 자식 클래스일 때만 접근 가능
        - private : 해당 클래스 내에서만 접근 가능
         */

        Person p = new Person();
        System.out.println(p.name);         //public
//        System.out.println(p.age);        //protected
//        System.out.println(p.address);    //default
    }

}
