package _32_Collections.strMap;

import java.util.*;

/*
 Map
 - 키(Key), 값(value)의 쌍으로 이루어진 데이터의 집합
 - 키는 중복 불가, 값은 중복 가능
 - 순서 없음
 * 인덱스가 아닌 키로 값에 접근
 */
public class StrMap {
    public static void main(String[] args) {
        Map<Integer, String> strMap1 = new HashMap<>();

        //추가 : V put(K key, V value)
        strMap1.put(2025001,"lee");
        strMap1.put(2025002,"kim");
        strMap1.put(2025003,"gang");
        strMap1.put(2025004,"min");
        strMap1.put(2025005,"rin");
        System.out.println(strMap1);


        //put() 메서드 사용 시 이미 존재하는 키의 경우 값이 수정됨
        strMap1.put(2025001,"leeeeeee");

        //특정 key의 value 조회 : V get(Object key)
        System.out.println(strMap1.get(2025002));

        //특정 key의 존재 여뷰
        boolean isContains1 = strMap1.containsKey("2025001");
        System.out.println("키 2025001의 존재 여부 : " + isContains1);

        //특정 value의 존재 여부
        boolean isContains2 = strMap1.containsValue("min");
        System.out.println("값 min의 존재 여부 : " + isContains2);

        /*
        Map 순회
        Map은 Colletion이 아니므로 직접적으로 순회할 수 없음(collection은 iterable 인터페이스를 상속 받음)
        순회하기 위해서는 Iterable<?>(반복이 가능하게 하는 인터페이스)인터페이스를 구현한 클래스이거나 배열[T[])일 때만 가능
         */
        System.out.println(strMap1.entrySet());
        System.out.println(strMap1.keySet());

        //KeySet()을 이용한 순회
        for(Integer key : strMap1.keySet()){
            System.out.println("Key : " + key + " /Value : " + strMap1.get(key));
        }

        //entrySet()을 이용한 순회 => Set<Map.Entry<K, V>> entrySet();
        for(Map.Entry<Integer,String> entry : strMap1.entrySet()){
            System.out.println(entry);
            System.out.print("Key : " + entry.getKey());
            System.out.println(" /Value : " + entry.getValue());
        }

        /*
        Map 변환
         */
        //Map -> Set 변환
        Set<Map.Entry<Integer,String>> entrySet1 = strMap1.entrySet();

        System.out.println("entrySet1의 크기 : " + entrySet1.size()); //key와 value의 쌍을 하나의 element로 취급
        System.out.println("entrySet1 : " + entrySet1);

        //Map -> List 변환 (Map은 컬렉션이 아니기 때문에 Set을 거쳐서 변환)
        List<Map.Entry<Integer,String>> entryList1 = new ArrayList<>(strMap1.entrySet());
        System.out.println("entryList1 : " +entryList1);

        /*
        Map 정렬
        Map은 빠른 탐색 및 검색을 위해서 설계된 자료구조 -> 정렬은 고려되지 않았기 때문에 정렬이 불가함
        Map -> Set -> List로 변환 후 정렬해야함
         */
        Collections.sort(entryList1, Map.Entry.comparingByKey()); //키 기준 정렬
        System.out.println("키 기준 정렬 : " + entryList1);

        Collections.sort(entryList1, Map.Entry.comparingByValue()); //값 기준 정렬
        System.out.println(entryList1);

        Collections.sort(entryList1, Map.Entry.comparingByKey(Comparator.reverseOrder())); //키 기준 역순 정렬
        System.out.println(entryList1);

        Collections.sort(entryList1, Map.Entry.comparingByValue(Comparator.reverseOrder())); //값 기준 역순 정렬
        System.out.println(entryList1);








    }
}
