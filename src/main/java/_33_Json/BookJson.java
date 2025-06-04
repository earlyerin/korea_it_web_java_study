package _33_Json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.Builder;
import lombok.ToString;

import java.util.Map;

/*
 퀴즈
 1. Book 객체 -> Json 문자열
    {"isbn":"978-1234567890","title":"자바의 정석","author":"남궁성","price":"38000","publisher":"도우출판"}

 2. Json -> Map
    {isbn=978-1234567890, title=자바의 정석, author=남궁성, price=38000, publisher=도우출판}

 3. Map -> Pretty Json
     {
        "isbn": "978-1234567890",
        "title": "자바의 정석",
         "author": "남궁성",
         "price": "38000",
         "publisher": "도우출판"
    }

 4. Json -> Book 객체
    Book(isbn=978-1234567890, title=자바의 정석, author=남궁성, price=38000, publisher=도우출판)
 */
public class BookJson {
    public static void main(String[] args) {
//        1. Book 객체 -> Json 형태 문자열
        Book book = Book.builder()
                .isbn("978-1234567890")
                .title("자바의 정석")
                .author("남궁성")
                .price(38000)
                .publisher("도우출판")
                .build();
        Gson gson = new Gson(); //변환을 위한 클래스
        System.out.println("[Json 형태(String)로 출력]");
        System.out.println(gson.toJson(book));
        /*
        Gson Class의 toJson() 메서드를 사용했을 때 궁금한 점 : 메모리를 소유하는 것은 여전히 Book 클래스 인가?
            1. Gson 객체를 이용해 toJson() 메서드를 호출하고 인수로 Book의 객체를 전달한다.
            2. 해당 메서드는 "Json 형태로 변환한 Book 객체의 복사본"을 String 타입으로 반환한다.
            3. 즉, "Gson Class는 출력 형태 변환을 위해 사용할 뿐" 출력할 내용의 메모리를 소유하지 않는다.
            (GsonBuilder Class도 마찬가지)
         */

//        2. Json 형태 문자열 -> Map
        String json = gson.toJson(book);
        Map<String, String> map = gson.fromJson(json, Map.class);
        System.out.println("[Map으로 변환하여 츌력]");
        System.out.println(map);

//        3. Map -> Pretty Json
        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();
        System.out.println("[Json의 PrettyPrinting형태(String)로 출력]");
        System.out.println(gsonBuilder.toJson(map));

//        4. Json -> Book 객체
        book = gson.fromJson(json, Book.class);
        System.out.println("[Book 객체]");
        System.out.println(book.toString());

    }
}

@Builder
@ToString
class Book{
    private String isbn;
    private String title;
    private String author;
    private int price;
    private String publisher;
}