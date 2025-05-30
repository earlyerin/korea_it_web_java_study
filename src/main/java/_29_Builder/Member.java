package _29_Builder;

public class Member {
    private String name;
    private int age;
    private String email;

    private Member(Builder builder){
        this.name = builder.name;
        this.age = builder.age;
        this.email = builder.email;
    }

    /*
    Builder class :  객체를 만들기 위한 준비 도구
    Builder의 build 메소드가 Member의 객체를 생성하도록 구현
     */
    public static class Builder{ //정적 내부 클래스
        private String name;
        private int age;
        private String email;

        //Builder 클래스 객체의 멤버변수에 매개변수를 대입(Setter 역할)
        public Builder name(String name){ //자기 자신 객체를 반환(메소드 체이닝)
            this.name = name;
            return this; //멤버변수 name이 세팅된 상태의 객체 반환
            /*
            메소드 체이닝 : 메소드를 연속해서 호출할 수 잇도록 객체 자신을 반환하는 방식
             */
        }

        public Builder age(int age){
            this.age = age;
            return this;
        }

        public Builder email(String email){
            this.email = email;
            return this;
        }

        public Member build(){
            return new Member(this); //모든 필드 설정이 완료된 Builder의 객체를 Member의 생성자에 대입하여 Member 클래스의 객체 생성
        }

    }

}
