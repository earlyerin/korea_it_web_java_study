package _32_Collections.strSet;

import java.util.*;

/* 퀴즈
 1. Java, Python, C, Python, Java, Java, C++, C, Java 순서대로 List1에 추가
 2. Set으로 변환하여 중복을 제거한 후 출력
 3. 다시 List2로 변환하여 정렬 후 출력
 4. searchLang 변수에 Java를 대입하고 List1에 몇 개 있는지 출력
 5. Set 요소의 개수 출력
 */
public class LanguageSet {
    public static void main(String[] args) {
        //1. Java, Python, C, Python, Java, Java, C++, C, Java 순서대로 List1에 추가
        List<String> strList1 = new ArrayList<>(Arrays.asList("Java", "Python", "C", "Python", "Java", "Java", "C++", "C", "Java"));
        System.out.println("strList1 : " + strList1);

        //2. Set으로 변환하여 중복을 제거한 후 출력
        Set<String> strSet1 = new HashSet<>(strList1);
        System.out.println("strSet2 : " + strSet1);

        //3. 다시 List2로 변환하여 정렬 후 출력
        List<String> strList2 = new ArrayList<>(strSet1);
        Collections.sort(strList2);
        System.out.println("정렬된 strList2 : " + strList2);

        /*
        4. searchLang 변수에 Java를 대입하고 List1에 몇 개 있는지 출력
        public static int frequency(Collection<?> c, Object o) : 컬렉션에서 해당 객체의 개수를 반환
         */
        String searchLang = "Java";
        System.out.println("strList1 [" + searchLang + "]의 개수 : " + Collections.frequency(strList1,searchLang));

        //5. Set 요소의 개수 출력
        System.out.println("strSet1의 요소 개수 : " + strSet1.size());
    }
}
