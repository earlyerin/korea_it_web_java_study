package _23_Abstraction;
/* 퀴즈
 1. Factroy 추상 클래스 상속
 2. 생성자
 3. 메소드 재정의
 4. 고유 메소드
    upgrade(String model) => "아이패드 *세대로 업그레이드 되었습니다."
 */
public class TabletFactory extends Factory {

    TabletFactory(String name) {
        super(name);
    }

    @Override
    public void produce(String model) {
        System.out.printf("[%s] 테블릿을 생산합니다.\n",model);
    }

    @Override
    public void manage() {
        System.out.println(getName() + " 공장을 관리합니다.");
    }

//    public void upgrade(String model){
//        System.out.println(model.substring(0, model.indexOf(model.replaceAll("[^1-9]", "")))
//                + (Integer.parseInt(model.replaceAll("[^1-9]", "")) + 1)
//                + model.substring(model.indexOf(model.replaceAll("[^1-9]", "")) + 1)
//                + "로 업그레이드 되었습니다.");
//    }

    public void upgrade(String model){
        String[] str = model.split("[0-9]");
        System.out.println( str[0]
                + (Integer.parseInt(model.replaceAll("[^1-9]", "")) + 1)
                + str[1]
                + "로 업그레이드 되었습니다.");
    }
}

