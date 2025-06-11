package _00_Blog.ObjectClass;

import java.util.ArrayList;
import java.util.List;

public class MadeClass {
    public static void main(String[] args) {
        //각 클래스의 객체 생성
        Car car =  new Car("QM3","white","2022",20_000_000);
        Art art = new Art("Nick Walker", "Open your eyes",1_000_000);
        Sofa sofa = new Sofa("W2600,D800,H800","Ivory",500_000);

        Object[] arrayItemList = new Object[3]; //Object 타입으로 배열 생성
        arrayItemList[0] = car; //객체 대입
        arrayItemList[1] = art;
        arrayItemList[2] = sofa;
        System.out.println("{Array}");
        for (Object obj : arrayItemList){
            System.out.println(obj.toString()); //재정의한 toString()으로 출력
        }

        List<Object> listItemList = new ArrayList<>(); //Object 타입으로 리스트 생성
        listItemList.add(car); //객체 대입
        listItemList.add(art);
        listItemList.add(sofa);
        System.out.println("{List}");
        for (Object obj : listItemList){
            System.out.println(obj.toString()); //재정의한 toString()으로 출력
        }

        //파라미터
        Item item = new Item();
        System.out.println(item.printItem(car)); //파라미터로 객체 전달 후 출력

    }
}
