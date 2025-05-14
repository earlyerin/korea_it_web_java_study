package _03_VariablesNaming;

public class VariablesNaming {
    public static void main(String[] args) {
        /* 변수명 짓는 법
        1. 저장되는 데이터에 어울리는 이름, 직관적이고 한 눈에 파악하기 쉬운 이름
        2. 밑줄(_), 문자, 숫자 사용가능 (단, 숫자는 첫문자로 사용 불가)
        3. 한 단어 또는 2개 이상 단어를 연속
        4. 소문자로 시작하고, 두번째 단어부터는 시작문자를 대문자로 -> 카멜 표기법
        5. 예약어 사용 불가 ex) public, static, void, int, float ...
        */

        /* 표기법
        파스칼 표기법(쌍봉낙타 표기법) - 클래스명, 파일명
        ex) LastName
        카멜 표기법(단봉낙타 표기법) - 변수명, 메소드명
        ex) lastName
        */

        String carBrandName = "KIA";
        String carModelName = "EV6";
        String carColor = "white";
        int carPassengerCapacity = 5;
        int carModelYear = 2025;

        /* 상수
        - 변하지 않는 데이터
        - 모두 대문자로 작성
         */
        final String COUNTRY_CODE = "KR";
//      COUNTRY_CODE = "US"; 변경 불가

    }
}
