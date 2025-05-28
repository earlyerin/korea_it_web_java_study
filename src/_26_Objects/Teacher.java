package _26_Objects;

import java.util.Objects;

public class Teacher {
    private String name;
    private String schoolName;

    public Teacher(String name){
        this.name = name;
    }

    public Teacher(String name, String schoolName) {
        this.name = name;
        this.schoolName = schoolName;
    }

    @Override
    public String toString() {
        return name +"선생님의 근무지는 " + schoolName + "입니다.";
    }

    /*
    오버라이딩 시 hashCode()와 equals() 병행
     */
    @Override
    public int hashCode() {
        return Objects.hash(name,schoolName);
         /*
          참조 주소가 아닌 내용을 hashcode로 변환
          즉, name과 schoolName의 값을 기반으로 고유한 숫자(hashCode)를 생성
          (값이 같으면 hashCode가 같도록 오버라이딩)
          */
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true; //참조 주소값이 같으면 true
        if(!(obj instanceof Teacher)) return false; //Teacher 타입이 아니면 false
        Teacher teacher = (Teacher) obj;
        return this.name.equals(teacher.name) && this.schoolName.equals(teacher.schoolName);
    }
    //equals에서 같다고 판별된 객체는 같은 해시코드를 가져야한다. (자바 공식규칙)
}
