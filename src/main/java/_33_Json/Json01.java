package _33_Json;

/*
 Json(JavaScript Object Notation)
 - 본래 자바스크립트 언어로 부터 파생되어 자바스크립트 구문을 따르지만
   언어 독립형 데이터 포맷(표기법)
 - Map 구조처럼 Key와 Value 형태, 구조화된 문자열 형태로 전송 및 저장할 때 유용
 - Java에서 직접적으로 사용할 수 없기 때문에 의존성에 라이브러리를 추가하여 사용
 */

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

/*
 Gson
 -  Google Json의 약자로 Java 객체와 Json 형태 간의 변환에 사용
 - 주요 클래스
    Gson : 주로 변환을 위해 사용하는 클래스
    GsonBuilder : Gson 인스턴스에 대한 사용자 정의 구성을 허용(prettyPrinting 등)
    JsonObject : Json의 객체를 나타냄
 */
public class Json01 {
    public static void main(String[] args) {
        JsonObject jsonObject1 = new JsonObject();

        //속성(Key,Value) 추가
        //key의 타입은 String만 가능하며 문자열을 대입할 경우 "문자열" 형태로 출력
        jsonObject1.addProperty("username", "rin");
        jsonObject1.addProperty("password", 1234);
        jsonObject1.addProperty("email", "test@gmail.com");
        System.out.println(jsonObject1);

        //출력 형태 변경
        Gson gson1 = new GsonBuilder().setPrettyPrinting().create();
        //gson1에 jsonObject1를 인수로 넘겨줘서 출력 형태를 변경
        String json1 = gson1.toJson(jsonObject1);
        System.out.println(json1);

        JsonObject address = new JsonObject();
        address.addProperty("city","Busan");
        address.addProperty("district", "gingu");
        address.addProperty("zipCode", 12345);

        //중첩 추가 : void add(String property, JsonElement value)
        jsonObject1.add("address", address);

        Gson gson2 = new GsonBuilder().setPrettyPrinting().create();
        String json2 = gson2.toJson(jsonObject1);
        System.out.println(json2);





    }
}
