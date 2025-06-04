package _33_Json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

/*
 퀴즈
 {
  "orderId": "ORD123456",
  "customer": "곽두팔",
  "product": "에어팟 프로 2세대",
  "quantity": 1,
  "price": 349000,
  "address": {
    "receiver": "곽두팔",
    "phone": "010-5678-1234",
    "city": "서울",
    "district": "마포구",
    "zipCode": "04123"
  }
 */
public class OrderJson {
    public static void main(String[] args) {
        JsonObject OrderInfo = new JsonObject();
        OrderInfo.addProperty("orderId", "ORD123456");
        OrderInfo.addProperty("customer", "곽두팔");
        OrderInfo.addProperty("product", "에어팟 프로 2세대");
        OrderInfo.addProperty("quantity", 1);
        OrderInfo.addProperty("price", 349000);

        JsonObject userInfo = new JsonObject();
        userInfo.addProperty("receiver", "곽두팔");
        userInfo.addProperty("phone", "010-5678-1234");
        userInfo.addProperty("city", "서울");
        userInfo.addProperty("district", "마포구");
        userInfo.addProperty("zipCode", "04123");

        OrderInfo.add("address", userInfo);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        System.out.println(gson.toJson(OrderInfo));



    }
}
