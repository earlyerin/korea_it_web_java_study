package _32_Collections.strList;

import java.util.*;

public class StrList {
    public static void main(String[] args) {
        List<String> strList1 = new ArrayList<>(Arrays.asList("A","B","C"));
        List<String> strList2 = new ArrayList<>();
        strList2.add("java");
        strList2.add("python");
        strList2.add("c#");
        strList2.add("javascript");
        strList2.add("kotlin");

        String[] strArray = {"rin","lee"};
        System.out.println(Arrays.toString(strArray));

        //
        System.out.println(strList1);
        System.out.println(strList2);

        /*
        특정 element 포함 여부
        boolean contains(Object o)
        * 문자열에 대해 포함여부를 검색할 때 "전체" 또는 "문자 하나 단위"(문자열은 문자로 이루어졌기 때문)의 일치를 확인 가능
         */
        String searchElem1 = "python";
        boolean isContains1 = strList2.contains(searchElem1);
        System.out.println(searchElem1 + "의 포함 여부 : " + isContains1); //true

        String searchElem2 = "py";
        boolean isContains2 = strList2.contains(searchElem2);
        System.out.println(searchElem2 + "의 포함 여부 : " + isContains2); //false

        String email = "test@gmail.com";
        boolean isContains3 = email.contains("@");
        System.out.println("@의 포함 여부 : " + isContains3); //true

        /*
        특정 element 삭제
        boolean remove(Object O)
         */
        String removeElem1 = "kotlin";
        boolean removeResult1 = strList2.remove(removeElem1);
        System.out.println(removeElem1 + "의 삭제 여부 : " + removeResult1);
        System.out.println(strList2);

        /*
        List의 정렬
         */
        //오름차순
        Collections.sort(strList2);
        System.out.println("오름차순 정렬된 strList2 : " + strList2);

        //내림차순
        Collections.sort(strList2, Collections.reverseOrder());
        System.out.println("내림차순 정렬된 strList2 : " + strList2);

        /*
        List 순회
         */
        System.out.println("---------for문----------");
        for (int i = 0; i < strList2.size(); i++) {
            System.out.println(strList2.get(i) + " 언어");
        }

        System.out.println("--------- 향상된 for문----------");
        for(String str : strList2){
            System.out.println(str + " 언어");
        }

    }
}
