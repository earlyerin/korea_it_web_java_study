package _35_Lambda;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LambdaMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String,Integer> map = new HashMap<>();

        System.out.print("상품 개수 입력>> ");
        int count = Integer.parseInt(sc.nextLine());

        for (int j = 0; j < count; j++) {
            System.out.print("상품명 입력>> ");
            String product = sc.nextLine();
            System.out.print("가격 입력>> ");
            int price = Integer.parseInt(sc.nextLine());
            map.put(product, price);
        }

        //forEach() 와 람다식을 이용한 출력
        System.out.println("[상품 목록]");
        map.forEach((product,price) ->
                System.out.println("상품명 : " + product + ", 가격 : " + price));
    }
}
