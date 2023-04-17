package interface_.example;

public class MainClass {
    public static void main(String[] args) {
        RemoteController rc = new RobotCleanerRemoteController("imou", "20만원");
        rc.turnOn();
        rc.turnOff();
        rc.showStatus();

        rc = new TVRemoteController(50);
        rc.turnOn();
        rc.turnOff();
        rc.showStatus();
    }
}
