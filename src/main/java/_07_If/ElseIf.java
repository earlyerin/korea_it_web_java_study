package _07_If;

public class ElseIf {
    public static void main(String[] args) {
        /*
        다중 조건문 elseif
        형식) if(조건) {
                조건이 참일 때 실행되는 코드
             }elseif(조건){
                조건이 참일 때 실행되는 코드
             }else
                조건이 거짓일 때 실행되는 코드
             }
         명령 수행이 조건에 의해 분기 처리
         */

        int avgScore = 88;
        /*
        90점 이상 "A"
        80점 이상 "B"
        70점 이상 "C"
        나머지 "D"
         */
        if(avgScore >= 90){
            System.out.println("등급 : A");
        } else if (avgScore >= 80) {
            System.out.println("등급 : B");
        } else if (avgScore >= 70) {
            System.out.println("등급 : C");
        }else {
            System.out.println("등급 : D");
        }

        /*
        중첩 if
         */
        int age = 20;
        String gender = "female";

        if(age >= 20) {
            if(gender.equals("male")){
                System.out.println("Adult Male");
            }else{
                System.out.println("Adult Female");
            }
        }else {
            System.out.println("Minor");
        }

    }
}
