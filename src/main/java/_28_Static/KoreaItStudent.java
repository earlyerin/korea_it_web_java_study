package _28_Static;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class KoreaItStudent {
    static String static_curriculum = "웹개발";
    private String name;
    private int age;

    public String getStatic(){
        return  static_curriculum;
    }
}
