package _27_Bean;

public class Main {
    public static void main(String[] args) {
        UserEntity userEntity = new UserEntity();

        userEntity.setUserId(1);
        userEntity.setUserName("이예린");
        userEntity.setUserAge(21);
        userEntity.setUserEmail("dldPfls1@naver.com");

        System.out.println(userEntity);
    }
}
