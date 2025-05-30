package _30_Singleton.AppConfig;

import lombok.Data;

/*
 설정 파일(싱글톤 패턴)
 */
@Data //자주 사용되는 시그니처 패키지(Getter, Setter, ToString, EqualsAndHashCode, RequiredArgsConstructor 등)
public class AppConfig {
    private static AppConfig instance;

    private String apiKey;
    private String appMode;

    private AppConfig(){
        this.apiKey = "DEFAULT-KEY";
        this.appMode = "PRODUCTION";
    };

    public static AppConfig getInstance(){
        if(instance == null){
            instance = new AppConfig();
        }
        return instance;
    }


}
