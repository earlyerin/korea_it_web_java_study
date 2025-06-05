package _34_Exception;

/*
 로그인 구현 : 아이디나 비밀번호가 틀렸을 때 사용자 정의 예외 발생
*/

class LoginFailedException extends Exception{ //사용자 정의 예외 처리 클래스
    //Constructor
    public  LoginFailedException(String message){
        super(message); //3. 상속받은 예외 클래스로 예외 메세지 전달
        System.out.println("로그인 실패 예외 발생!!!"); //4. 출력
    }
}

public class Exception02 {
    public static void login(String id, String pw) throws LoginFailedException{
        //5. throws LoginFailedException : 예외 발생 시 해당 메서드를 호출한 곳으로 예외 전가

        String correctId = "admin";
        String correctPw = "1q2w3e4r";

        if(!id.equals(correctId) || !pw.equals(correctPw)){ //사용자 정의 예외
            throw new LoginFailedException("ID 또는 PW가 틀렸습니다.");
            //1. throw new LoginFailedException() : 의도적으로 예외 발생 시키기(객체 생성)
            //2. "ID 또는 PW가 틀렸습니다." : 생성자로 getMassage() 내용 전달
        }
    }

    public static void main(String[] args) {
        String inputId = "admin";
        String inputPw = "1234qwer";

        try{
            login(inputId,inputPw); //6. 예외를 전달받으면 try-catch 구문으로 처리
        }catch (LoginFailedException e){
            System.out.println(e.getMessage()); //7. 예외 메세지 출력
        }
    }
}
