package _32_Collections.strSet;

import java.util.*;

/*
 Set ( 집합의 개념을 도입한 자료구조 )
 - 중복 허용 안함 : 보통 고유한 값의 집합을 다룰 때 사용
 - 순서 없음
 * Set과 List의 특성 차이 때문에 list <-> set 간의 형변화 중요 *
 중복이 있는 list를 만들고 중복을 제거하기 위해 set으로 변환하면 중복을 제거할 수 있다.
 Set에는 순서가 없으므로 list로 변환하여 정렬을 할 수 있다.
 */
public class StrSet {
    //HashSet - Set 중에 가장 빠른 성능
    public static void main(String[] args) {
        Set<String> strSet1 = new HashSet<>();
        List<String> strList1 = new ArrayList<>();

        strSet1.add("java");
        strSet1.add("java");
        strSet1.add("java");
        strSet1.add("java");
        strSet1.add("python");
        strSet1.add("python");
        strSet1.add("python");
        strSet1.add("1");
        strSet1.add("1");

        System.out.println(strSet1); // [1, python, java], 중복 제거, 무순서
        for (String elem : strSet1){
            System.out.println(elem);
        }

//        for (int i = 0; i < strSet1.size(); i++) {
//            System.out.println(strSet1.get());    => 인덱스가 존재하지 않기 때문에 get() 메서드가 없다.
//        }

        /*
        element 추출 -> List로 형변환
        boolean addAll(Collection<? extends E> c)
         */
        strList1.addAll(strSet1);
        System.out.println(strList1);

        strList1.addAll(strSet1);
        strList1.addAll(strSet1);
        System.out.println(strList1);
        Collections.sort(strList1);
        System.out.println(strList1);

        /*
         element 추출 -> Set으로 형변환
         */
        Set<String> strSet2 = new HashSet<>();
        strSet2.addAll(strList1);
        System.out.println(strSet2);
    }
}
