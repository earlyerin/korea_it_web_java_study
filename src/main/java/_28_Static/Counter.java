package _28_Static;

public class Counter {
    public static int count = 0;
    public static void increase(){
        count++;
    }

    public static void main(String[] args) {
        increase();
        increase();
        System.out.println(count);
    }
}
