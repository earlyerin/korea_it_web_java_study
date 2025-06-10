package _36_StreamApi;

import java.util.Arrays;
import java.util.List;

/*
 Stream API
 - Java8 버전에서 도입됨
 - 컬렉션과 배열에 저장된 데이터를 선언형으로 처리하기 위한 추상화된 반복 프레임워크
 - 필터링, 매핑, 정렬, 집계 등의 기능 사용가능
 - 메소드 체이닝을 활용(가독성, 간결성)
 - Stream을 사용하면 타입이 Stream으로 변경됨
 */
public class StreamApi {
    public static void main(String[] args) {
        List<String> names =
                Arrays.asList("김영", "김일", "김이", "김삼", "김사", "최오", "최육", "이칠", "박팔");
        System.out.println(names);

        //필터링 : 조건을 통해 요소를 거름 => filter()
        List<String> namesWithKim =
                names.stream()
                .filter(name -> name.startsWith("김")) //조건(람다식)
                .toList(); //List 타입으로 반환하도록
        System.out.println(namesWithKim);

        //
        List<String> engListNames =
                Arrays.asList("alice", "anya", "bacon", "camel", "pascal", "yor", "spy");
        System.out.println("<English Name>\n" +engListNames);

        List<String> result = engListNames.stream()
                .filter(name -> name.startsWith("a"))
                .map(String::toUpperCase) // == name -> name.toUpperCase() //대문자로 변환
                .sorted() //정렬
                .toList();
        /*
        요소에 하나마다 메서드를 적용해서 조건을 걸 때 => 람다식
        각 요소를 매개변수로 받아서 매개변수를 참조하여 메소드 호출

        모든 요소에 적용 => 클래스::메서드
        해당 타입 클래스의 메소드를 직접 호출하여 각 요소에 적용
         */
        System.out.println("<Result>\n" + result);

        result.forEach(name -> System.out.println(name));
        result.forEach(System.out::println);
    }
}
