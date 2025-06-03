package _31_Generic.WildCard.UpperBoundedWildcard;

public class SuperWildcard {
    /*
    하한 경계 와일드카드(하위 타입 제한)
    <? super 클래스명>
    해당 클래스를 포함하여 상위의 모든 타입을 받을 수 잇다.
    쓰기는 가능하나, 읽기는 불가능
     */
    public static void putDog(Box<? super Dog> box){ //Dog 또는 Dog의 상위 타입만 허용
        box.setItem(new Dog()); //box가 Dog 또는 Dog의 상위 클래스이므로 Set

//        Object obj = box.getItem(); => 모든 클래스의 최상위 타입인 Object로는 읽기 가능
//        System.out.println("0bject : " + obj);
    }
}
