package _33_Json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

/*
 Java와 Json 간의 변환
 */
@AllArgsConstructor
@ToString
class User {
    private String nm;
    private String age;
    private String pw;
    private String email;
}

public class Json02 {
    public static void main(String[] args) {
        //Java -> Json
        Gson gson = new Gson();
        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();
        String userJson = null;

        User user1 = new User("rin", "21", "1234", "test1@gmail.com");
        System.out.println("user 객체 => " + user1);

        userJson = gson.toJson(user1); //user객체를 String으로 변환
        System.out.println("gson 사용 => " + userJson);

        userJson = gsonBuilder.toJson(user1); //user객체를 Json 형태로 변환
        System.out.println("gsonBuilder 객체 => " + userJson);

        //JsonObject -> Json
        JsonObject jsonObject1 = new JsonObject();
        jsonObject1.addProperty("studentCode", "2025001");
        jsonObject1.addProperty("studentName", "rin");
        jsonObject1.addProperty("studentYear", "2");
        jsonObject1.addProperty("score", "96.7");

        System.out.println("gson 사용 => " + gson.toJson(jsonObject1));
        System.out.println("gsonBuilder 객체 => " + gsonBuilder.toJson(jsonObject1));

        //Map -> Json
        Map<String,String> map1 = new HashMap<>();
        map1.put("productCode", "NT960XHA");
        map1.put("productName", "SamsungNotebook");

        System.out.println("gson 사용 => " + gson.toJson(map1));
        System.out.println("gsonBuilder 객체 => " + gsonBuilder.toJson(map1));

        //Json -> Map
        Map<String,String> map2 = gson.fromJson(userJson, Map.class);
        System.out.println(map2);

        //Json -> User(Object)
        User user2 = gson.fromJson(userJson, User.class);
        System.out.println(user2);

        //Json(타입 : String) -> JsonObject(타입 : JsonObject)
        JsonObject jsonObject2 = gson.fromJson(userJson, JsonObject.class);
        System.out.println(jsonObject2);


    }
}
