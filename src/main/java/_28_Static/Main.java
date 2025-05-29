package _28_Static;

public class Main {
    public static void main(String[] args) {
        /* static
         - 클래스 수준에서 변수를 정의하거나 메소드를 호출할 때 사용
         - static으로 선언된 변수나 메소드는 클래스의 인스턴스에 속하지 않고 클래스 자체에 속한다.
           즉, 인스턴스를 생성하지 않고 접근이 가능하다.
         - static 변수와 메소드는 클래스 로드 시 메모리에 할당된다.
         - 모든 인스턴스가 동일한 static 변수에 접근하므로 데이터를 공유하거나 상태를 저장할 때 유용하다.
         */
        System.out.println(KoreaItStudent.static_curriculum);
        KoreaItStudent koreaItStudent = new KoreaItStudent("이예린", 21);
        System.out.println(koreaItStudent.getStatic());
    }
}
