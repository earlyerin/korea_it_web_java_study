package _31_Generic;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResponseData<T> {
    /*
    제네릭(Generic)
     - 클래스나 메서드가 다룰 데이터 타입을 미리 명시하여 재사용성과 유연성을 높이는 기술
     - 타입 매개변수(Type Parameter) : 클래스나 메서드에서 사용할 실제 타입을 대신하여 사용하는 매개변수(일반적으로 대문자 하나로 표기)
        T(Type)     일반적으로 클래스 타입을 나타낼 때 사용
        E(Element)  컬렉션의 요소(element)를 나타낼 때 사용
        K(Key)      Map의 Key를 나타낼 때 사용
        V(Value)    Map의 Value를 나타낼 때 사용
     - 인스턴스화할 때 타입을 명시한다.
     - 다양한 자료형에 대해 하나의 클래스나 메서드를 정의할 수 있다. => 재사용성 증가, 중복 최소화
     - 컴파일 시 타입을 확인하므로 타입 안정성 증가(잘못된 타입으로 인한 예외 발생 감소)
     */
    private String message;
    private T data;

    @Override
    public String toString() {
        return message + data;
    }

//    private String data1;
//    private int data2;
//    private double data3;

//    public String toStringStr() {
//        return message + data1;
//    }
//
//    public String toStringInt() {
//        return message + data2;
//    }
//
//    public String toStringDouble() {
//        return message + data3;
//    }


}
