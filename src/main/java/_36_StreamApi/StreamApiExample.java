package _36_StreamApi;

import java.util.*;

//퀴즈
public class StreamApiExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> product = Arrays.asList(
                "애플 아이폰 15 Pro",
                "애플 맥북 프로 M3",
                "애플 아이패드 에어 5세대",
                "애플 에어팟 프로 2세대",
                "삼성 갤럭시 S24 울트라",
                "삼성 갤럭시 Z 플립 5",
                "삼성 갤럭시탭 S9",
                "삼성 갤럭시 워치6",
                "엘지 울트라 기어 게이밍 모니터"
        );
        System.out.print("브랜드명 입력>> ");
        String brandName = sc.nextLine();

        if(brandName.matches("[a-zA-z]+")){ //영문으로 입력했을 경우
            String brand = brandName.toUpperCase();
            brandName = switch (brand) { //한글로 변경
                case "SAMSUNG" -> "삼성";
                case "APPLE" -> "애플";
                case "LG" -> "엘지";
                default -> brandName;
            };
        }

        final String finalBrandName = brandName; //지역 변수를 람다식에서 사용할 경우 final 변수만 사용 가능
        List<String> brandProduct = product.stream()
                .filter(brand -> brand.startsWith(finalBrandName))
                .toList();

        if(brandProduct.isEmpty()){
            System.out.println("해당 브랜드의 상품이 없습니다.");
        }else {
            System.out.println("{" + brandName + "의 상품}\n" + brandProduct);
        }
    }
}
