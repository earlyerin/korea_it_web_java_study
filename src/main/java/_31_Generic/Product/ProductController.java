package _31_Generic.Product;

public class ProductController {
    public static void main(String[] args) {
//        Product<String> productStr = new Product<>("Laptop","Intel i7");
//        System.out.println(productStr);
//
//        Product<Double> productDou = new Product<>("Smartphone", 123.123);
//        System.out.println(productDou);
//
//        Product<Boolean> productBoo = new Product<>("Availble",true);
//        System.out.println(productBoo);

        Product<String> product = Product.<String>builder()
                .productName("SmartPhone")
                .productInfo("Intel i7")
                .build();
        System.out.println(product);
    }
}
