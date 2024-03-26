package Chap_05;

public class CarExam {
    public static void main(String[] args) {
        Car c1 = new Car(); // new = 클래스를 메모리에 올려달라는 요청
        Car c2 = new Car(); // 메모리에 올라간 클래스 = 인스턴스
        Car car = new Car();

        c1.name = "델리로드 100";
        c1.number = 8600;

        System.out.println(c1.name);
        System.out.println(c1.number);

        car.method1();
        car.method3(5);
        int value = car.method3(55);
        System.out.println(value);
    }
}
