package interface_.example;

public class RobotCleanerRemoteController implements RemoteController{
    public String modelName;
    public String price;
    
    public RobotCleanerRemoteController (String modelName, String price){ // 생성자
        this.modelName = modelName;
        this.price = price;
    }

    @Override
    public void turnOn() {
        System.out.println("로봇 청소기를 켭니다");
    }

    @Override
    public void turnOff() {
        System.out.println("로봇 청소기를 끕니다");
    }

    @Override
    public void showStatus() {
        System.out.println("모델명 : "+this.modelName);
        System.out.println("가격 : "+this.price);
    }
}
