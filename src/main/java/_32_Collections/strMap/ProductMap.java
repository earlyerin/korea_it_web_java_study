package _32_Collections.strMap;

import java.util.*;

/*
 퀴즈
 1. Scanner 객체 생성
 2. 인스턴스명이 productMap인 HashMap 생성(Key: String, Value: Integer)
 3. 상품 등록하기 구현
    - for문 이용(5번 반복)
    - 상품명(키)와 가격(값)을 입력받아서 Map에 추가
 4. 전체 상품 출력 (향상된 for문)
 5. 상품 가격 수정
    - 수정할 상품명 입력받기()
    - 입력한 상품이 존재하면 가격을 입력받아 수정
 6. 특정 상품 검색
    - 검색할 상품명 입력받기()
    - 입력한 상품이 존재하면 가격 출력
 7. 정렬하기
    - 정렬하기 위해 List로 변환 후 키 기준으로 정렬
    - 향상된 for문으로 출력
 */
public class ProductMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> productMap = new HashMap<>();

        exit:
        while (true){
            System.out.println("=================================== ProductMap ====================================");
            System.out.println("1.상품 등록 | 2.전체 상품 출력 | 3.상품 가격 수정 | 4.상품 가격 검색 | 5. 상품 정렬 | 6.종료");
            int num = sc.nextInt();
            sc.nextLine();
            switch (num){
                case 1 :
                    for (int i = 0; i < 5; i++) {
                        System.out.print("상품명 입력>> ");
                        String productKey = sc.nextLine().trim();
                        System.out.print("가격 입력>> ");
                        Integer productValue = sc.nextInt();
                        sc.nextLine(); //버퍼 메모리(\n) 비우는 방법1
                        /*
                        버퍼 메모리(\n) 비우는 방법2
                        Integer productValue = Integer.parseInt(sc.nextLine);
                         */
                        productMap.put(productKey, productValue);
                    }
                    System.out.println("등록 완료!");
                    break;
                case 2 :
                    System.out.println("---------------- 전체 상품 목록 ----------------");
                    for (String key : productMap.keySet()){
                        System.out.println("[상품명 : " + key + " | 가격 : " + productMap.get(key) + "원]");
                    }
                    System.out.println("----------------------------------------------");
                    break;
                case 3 :
                    System.out.print("가격을 수정할 상품명 입력>> ");
                    String modifyProduct = sc.nextLine();
                    if(productMap.containsKey(modifyProduct)){
                        System.out.print("가격 입력>>");
                        Integer modifyPrice = sc.nextInt();
                        productMap.put(modifyProduct,modifyPrice);
                        System.out.println("수정 완료!");
                    }else {
                        System.out.println("*** 존재하지 않는 상품입니다. ***");
                    }
                    break;
                case 4 :
                    System.out.print("가격을 검색할 상품명 입력>> ");
                    String searchProduct = sc.nextLine();
                    if (productMap.containsKey(searchProduct)){
                        System.out.println(searchProduct + "의 가격 : " + productMap.get(searchProduct) + "원");
                    }else {
                        System.out.println("*** 존재하지 않는 상품입니다. ***");
                    }
                    break;
                case 5 :
                    List<Map.Entry<String,Integer>> sortList = new ArrayList<>(productMap.entrySet());

                    System.out.println("------------ 상품 목록 오름차순 정렬 -------------");
                    sortList.sort(Map.Entry.comparingByKey());
                    for (Map.Entry<String,Integer> productSort : sortList){
                        System.out.println(productSort);
                    }
                    System.out.println("------------ 상품 목록 내림차순 정렬 -------------");
                    sortList.sort(Map.Entry.comparingByKey(Collections.reverseOrder()));
                    for (Map.Entry<String,Integer> productSort : sortList){
                        System.out.println(productSort);
                    }
                    System.out.println("----------------------------------------------");
                    break;
                case 6 :
                    break exit;
            }

        }
    }
}
