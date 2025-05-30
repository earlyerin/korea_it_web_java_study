package _30_Singleton.AppConfig;

public class Main {
    public static void main(String[] args) {
        AppConfig appConfig = AppConfig.getInstance();
        System.out.println(appConfig);

        appConfig.setApiKey("TEST-KEY-123");
        appConfig.setAppMode("DEBUG");
        System.out.println(appConfig);

        AppConfig another = AppConfig.getInstance();
        System.out.println(another);

        System.out.println(appConfig == another);
    }
}
