package _25_casting.Control;

public class Main {
    public static void main(String[] args) {
        Power[] powers = {new Computer(), new Tv(), new Mouse(), null, null};
        CentralControl centralControl = new CentralControl(powers);

        System.out.println(centralControl.checkEmpty());
        centralControl.addDevice(new LEDLight());
        centralControl.addDevice(new SmartPhone());
        centralControl.addDevice(new Speaker());

       centralControl.powerOn();
       centralControl.powerOff();

       centralControl.performSpecificMethod();

    }
}
