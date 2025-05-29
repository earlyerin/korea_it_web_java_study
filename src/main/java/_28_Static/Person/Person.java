package _28_Static.Person;

public class Person {
    public static int population = 0; //정적 변수
    //static으로 선언하지 않을 경우 객체가 생성될 때마다 0으로 초기화

    public String name;

    public Person(String name) {
        this.name = name;
        population++;
        System.out.println("현재 인구 수 : " + population);
    }

    public void sayHello(){
        System.out.println("안녕하세요. 저는 " + name + "입니다.");
    }

    public static void showPopulation(){  //정적 메소드
        System.out.println("전체 인구 수 : " + population);

    }


}