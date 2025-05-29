package _27_Bean;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//@RequiredArgsConstructor 생성자에 필수로 받을 멤버변수는 final OR @NonNull
@ToString
public class UserEntityLombok {
    private int userId;
    private String userName;
    private int userAge;
    private String userEmail;
}
/* Entity
 - 데이터베이스의 테이블과 1 : 1 매핑되는 클래스
 - 자바 객체 <-> DB 테이블 간 데이터를 매핑하기 위해 사용
 - DB와 CRUD 작업
 */

/* Lombok
 - 자바의 반복적인 코드를 자동으로 생성해주는 라이브러리
 - Getter, Setter, ToString, Builder 등의 기능 제공
 */
