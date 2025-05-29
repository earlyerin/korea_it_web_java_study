package _27_Bean;
/*
 1. 멤버변수 : userId, userName, userAge, userEmail
 2. 기본 생성자
 3. Getter & Setter
 4. toString() 오버라이딩 => user의 모든 정보 출력
 */

/* Bean : 하나의 객체 설계 규칙(명세, 가이드라인)
 [조건]
 - 모든 멤버변수는 private로 선언(캡슐화)
 - 기본 생성자 존재
 - Getter & Setter 메소드로 접근
 */
public class UserEntity {
    //Field
    private int userId;
    private String userName;
    private int userAge;
    private String userEmail;

    //Constructor
    public UserEntity() {
    }

    //Getter
    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public int getUserAge() {
        return userAge;
    }

    public String getUserEmail() {
        return userEmail;
    }

    //Setter
    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    //toString
    @Override
    public String toString() {
        return "UserEntity{" +
                "userId=" + userId +
                ", userName=" + userName +
                ", userAge=" + userAge +
                ", userEmail=" + userEmail +
                '}';
    }
}
