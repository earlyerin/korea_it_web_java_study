package _25_casting.Control;

public class CentralControl {
    private Power[] deviceArray;

    public CentralControl(Power[] deviceArray) {
        this.deviceArray = deviceArray;
    }

    //장치 연결하기
    public void addDevice(Power device) {//암시적으로 업캐스팅
        int emptyIndex = checkEmpty();
        if(emptyIndex == -1) {
            System.out.println("더 이상 장치를 추가할 수 없습니다.");
            return;
        }
        deviceArray[emptyIndex] = device;
        System.out.println(device.getClass().getSimpleName() + " 장치가 연결되었습니다.");
        /*
        device => _25_casting.Control.SmartPhone@7cca494b
        device.getClass() => class _25_casting.Control.SmartPhone
        getClass().getSimpleName() => SmartPhone
         */
    }

    //연결할 자리 찾기
    public int checkEmpty() {
        for (int i = 0; i < deviceArray.length; i++) {
            if(deviceArray[i] == null) {
                return i; //비어있는 위치 리턴
            }
        }
        return -1; //비어있는 자리가 없으면 -1
    }

    //모든 장치 전원 켜기
    public void powerOn(){
        for(Power device : deviceArray){
            if(device == null){ //NullPointException 방지
                System.out.println("장치가 등록되지 않은 슬롯입니다.");
                continue;
            }
            device.on();
        }
    }

    //모든 장치 전원 끄기
    public void powerOff(){
        for(int i = 0; i < deviceArray.length; i++){
            if(deviceArray[i] == null){ //NullPointException 방지
                System.out.println("장치가 등록되지 않은 슬롯입니다.");
                continue;
            }
            deviceArray[i].off();
        }
    }

    //각 인스턴스의 고유메서드 호출
    public void performSpecificMethod(){
        for(Power device : deviceArray){
            if(device instanceof Tv){ //ClassCastException 방지
                ((Tv) device).changeChannel(14); //다운캐스팅
            } else if (device instanceof Computer) {
                ((Computer)device).brightnessControl(80);
            } else if (device instanceof Speaker) {
                ((Speaker)device).changeVolume(90);
            } else if (device instanceof LEDLight) {
                ((LEDLight)device).changeColor();
            } else if (device instanceof Mouse) {
                ((Mouse)device).leftClick();
            } else if (device instanceof SmartPhone) {
                ((SmartPhone)device).sendTalk();
            }
        }
    }


}
