package _24_Interface;
/*
boolean 값으로 On, Off 상태 변경
 */
public class PowerButton extends Button {
    private boolean status;

    @Override
    public void onPressed() {
        if(status){
            //true -> false(전원 끄기)
            System.out.println("전원을 끕니다.");
            status = false;
        }else{
            //false -> true(전원 키기)
            System.out.println("전원을 킵니다.");
            status = true;
        }
    }
}
