package _36_StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//퀴즈
public class ProductMain {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("삼성 갤럭시북 이온", 1350000),
                new Product("삼성 갤럭시북 이온", 1350000),
                new Product("삼성 갤럭시탭 S9", 950000),
                new Product("삼성 갤럭시 S24 울트라", 1590000),
                new Product("애플 맥북에어 M2", 1690000),
                new Product("애플 맥북프로 M3", 2490000),
                new Product("애플 아이패드 에어 5세대", 929000),
                new Product("애플 아이폰 15 프로", 1550000),
                new Product("엘지 그램 17", 2190000),
                new Product("엘지 울트라PC", 1140000)
        );

        Scanner sc= new Scanner(System.in);
        System.out.print("브랜드 명을 입력하세요.\n>> ");
        String inputBrand = sc.nextLine();
        System.out.print("최대 가격을 입력하세요.\n>> ");
        int inputMaxPrice = Integer.parseInt(sc.nextLine());

        if(inputBrand.matches("[a-zA-z]+")){ //영문으로 입력했을 경우
            String brand = inputBrand.toUpperCase();
            inputBrand = switch (brand) { //한글로 변경
                case "SAMSUNG" -> "삼성";
                case "APPLE" -> "애플";
                case "LG" -> "엘지";
                default -> inputBrand;
            };
        }

        final String finalInputBrand = inputBrand;
        List<Product> result = products.stream()
                .filter(brand -> brand.getName().contains(finalInputBrand))
                .filter(product -> product.getPrice() <= inputMaxPrice)
                .toList();

        if(result.isEmpty()){
            System.out.println("검색 조건에 일치하는 상품이 없습니다.");
        }else {
            System.out.println("{" + inputMaxPrice + "원 이하의 " + inputBrand + " 상품}\n" + result);
        }

    }
}
