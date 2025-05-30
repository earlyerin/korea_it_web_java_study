package _29_Builder.Computer;

public class ComputerMain {
    public static void main(String[] args) {
        Computer computer = new Computer.Builder("AMD 7500f", 16)
                .storage(256)
                .hasWifi(true)
                .hasBluetooth(false)
                .build();

        computer.spec();
    }
}
