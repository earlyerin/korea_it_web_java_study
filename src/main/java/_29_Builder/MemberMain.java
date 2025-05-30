package _29_Builder;

public class MemberMain {
    public static void main(String[] args) {
        Member member = new Member.Builder()
                .name("이예린")
                .age(21)
                .email("dldPfls@naver.com")
                .build();
        /*
        Builder Class 사용 이점
        - 생성자를 사용하면 매개변수의 위치와 개수가 고정적이지만, Builder로 메소드 체이닝이 가능하므로 순서와 개수의 구애가 없다.
        - 가독성 향상, 메서드명과 매개변수가 직관적이다.
        - 유지보수성 향상, 필드 추가 및 변경에 용이하다.
         */
    }
}
