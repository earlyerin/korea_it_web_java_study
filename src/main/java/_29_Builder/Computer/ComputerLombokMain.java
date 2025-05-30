package _29_Builder.Computer;

public class ComputerLombokMain {
    public static void main(String[] args) {
        ComputerLombok computerLombok = ComputerLombok.builder()
                .cpu("AMD 7500f")
                .ram(16)
                .storage(256)
                .hasWifi(true)
                .hasBluetooth(false)
                .build();

        System.out.println(computerLombok);
    }
}
