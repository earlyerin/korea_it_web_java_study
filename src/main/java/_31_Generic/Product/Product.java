package _31_Generic.Product;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.ToString;

//@AllArgsConstructor
@Builder
@ToString
public class Product<T> {
    private String productName;
    private T productInfo;
}
