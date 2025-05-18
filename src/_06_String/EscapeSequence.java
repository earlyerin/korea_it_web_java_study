package _06_String;

public class EscapeSequence {
    public static void main(String[] args) {
        /* 이스케이프 문자
        \n(new line) : 개행
        \t(tab) : 일정 간격 띄우기
        \\ : \(역슬레시) 출력
        \" : "(쌍따움표) 출력
        \' : '(홑따움표) 출력
         */
        System.out.println("I want to go..");
        System.out.println("home..");
        System.out.println("I want to go..\nhome..");

        System.out.println("\tSon");
        System.out.println("\tFaker");
        System.out.println("\tBTS");
        System.out.println("\tBlackPink");

//      System.out.println("C:\Program Files\java"); 이스케이프 문자로 인식
        System.out.println("C:\\Program Files\\java");

        System.out.println("손흥민의 팀은 \"토트넘 홋스퍼 FC\"이다.");

        System.out.println("페이커는 '신'이다.");
        System.out.println("페이커는 \'신\'이다.");

        char c = 'A';
        c ='\'';
        System.out.println(c);

        /* 퀴즈
        String id = "050301-1234567"
        050301-1 까지 출력
         */
        String id = "050301-1234567";
        System.out.println(id.substring(0,8));
        System.out.println(id.substring(0, id.indexOf("-") + 2));

    }
}
