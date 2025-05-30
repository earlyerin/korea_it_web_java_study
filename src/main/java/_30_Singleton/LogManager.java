package _30_Singleton;

import lombok.extern.java.Log;

/*
 싱글톤 패턴 : 애플리케이션 전체에서 단 하나의 인스턴스를 공유하도록 하는 패턴
 - 자원을 공유할 때 사용한다.
 - 객체를 여러번 생성할 필요 없이 한 번의 생성으로 재사용한다.
 */
public class LogManager {
    //로그매니저 : 시스템 전체에서 로그를 기록하는 객체(하나로 충분)로 같은 로그 객체를 공유

    private static LogManager instance; //자기 자신의 객체

    private LogManager(){ }; //외부에서 객체 생성이 불가능하도록 private

    public static LogManager getInstance() { //생성자 역할, 인스턴스 재사용을 구현한 메서드
        if(instance == null) { // 정적 변수에 인스턴스가 없으면
            instance = new LogManager(); //생성
        }
        return instance; //있으면 기존의 인스턴스 재사용
    }

    public void log(String message){
        System.out.println("LOG => " + message);
    }

}
