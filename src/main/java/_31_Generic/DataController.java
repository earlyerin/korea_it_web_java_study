package _31_Generic;

import _27_Bean.UserEntityLombok;

import java.util.Date;

public class DataController {
    public static void main(String[] args) {
//        ResponseData responseData = new ResponseData("Data : ","Hello", 123,123.123);

        //타입이 다르므로 각가의 toString 메소드를 호출하여 사용

//        System.out.println(responseData.toStringStr());
//        System.out.println(responseData.toStringInt());
//        System.out.println(responseData.toStringDouble());

        //제네릭을 사용해 toString 메소드를 오버라이딩해서 사용

        ResponseData<String> responseDataStr = new ResponseData<String>("Data : ", "Hello");
        System.out.println(responseDataStr);

        ResponseData<Integer> responseDataInt = new ResponseData<>("Data : ", 123);
        System.out.println(responseDataInt);

        ResponseData<Double> responseDataDou = new ResponseData<>("Data : ", 3.141592);
        System.out.println(responseDataDou);

        //여러 클래스 타입으로 선언 가능
        Date now = new Date();
        ResponseData<Date> nowData = new ResponseData<>("Now : ", now);
        System.out.println(nowData);

        UserEntityLombok userEntityLombok = new UserEntityLombok();
        userEntityLombok.setUserId(1);
        userEntityLombok.setUserName("rin");
        userEntityLombok.setUserAge(21);
        userEntityLombok.setUserEmail("dldPfls@gmail.com");

        ResponseData<UserEntityLombok> userData = new ResponseData<>("Data : ", userEntityLombok);
        System.out.println(userData);

    }
}
