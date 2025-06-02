package _31_Generic.WildCard.UnBoundedWildcard;

public class UnBoundedWildcard {
    /*
    와일드카드(Wildcard)
    ? => 타입 제한이 없다. (비한정적 와일드 카드)
    하지만 타입이 명확하지 않기 때문에 읽기만 가능, 쓰기는 불가능
     */
    public static void printBox(Box<?> box){ //모든 타입을 받음
        System.out.println("Box : " + box.getItem());
    }

//    public static void setBox(String str, Box<?> box) { 타입이 명확하지 않기 때문에 Setter 불가능
//        box.setItem(str);
//    }
}
