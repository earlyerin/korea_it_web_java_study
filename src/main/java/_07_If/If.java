package _07_If;

public class If {
    public static void main(String[] args) {
        /*
        조건문 if
        형식) if(조건) {
                조건이 참일 때 실행되는 코드
             }
         */

        //키가 120 이상이면 탑승 가능
        int height = 130;
        if(height >= 120){
            System.out.println("Height available for boarding");
            System.out.println("Boarding Complete!");
        }

        //키가 120 이상이고 어른이 아니면 탑승 가능
        boolean isAdult = false;
        if(!isAdult && height >= 120){
            System.out.println("Child and Height available for boarding");
            System.out.println("Boarding Complete!");
        }

        //키가 120 이상 이거나 어른이면 탑승 가능
        if(isAdult || height >= 120){
            System.out.println("Available for boarding");
        }

    }
}
