package Chap_05;

public class Car {
    // Type Field (이름 번호 등)
    String name;
    int number;

    // Type Method (전진 행동 등)
    // 입력값 : 매개변수 (전달된 인자를 받아들이는 변수), 인자 (어떤 함수를 호출시에 전돨되는 값)
    // 리턴값 :
    public void method1(){
        System.out.println("method1 실행됨..");
    }

    public void method2(int x){
        System.out.println(x + "를 이용한 method2 실행됨..");
    }

    public int method3(int x){
        System.out.println(x+" method3 실행");
        return 10;
    }
}
