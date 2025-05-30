package _29_Builder.Computer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@ToString
@Builder
public class ComputerLombok {
    private String cpu;
    private int ram;

    //Builder를 사용하면 멤버변수를 필수로 입력하도록 할 수 없다.
//    private final String cpu;
//    private final int ram;

    private int storage;
    private boolean hasWifi;
    private boolean hasBluetooth;


}
