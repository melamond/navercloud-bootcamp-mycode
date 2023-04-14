package example.super_;

public class AirplaneMain {
    public static void main(String[] args) {
        SupersonicAirplane a1 = new SupersonicAirplane("AF001");

        for (int i =0 ; i < 8; i++) // 0부터 시작, super() 로 800까지 가속
            a1.fly();
        a1.showStatus();

        System.out.println("-----------");
        for (int i =0 ; i < 3; i++) // 800부터 시작, super()로 900, supersonic으로 1500 까지 가속
            a1.fly();
        a1.showStatus();
        System.out.println("-----------");
    }
}
