package example.super_;

public class Airplane {
    public String planeCode;
    public int speed;
    public int gas;

    // 속도 0, 연료 100으로 고정, 편명만 입력 받는 생성자를 정의

    public Airplane(String planeCode){
        this.planeCode = planeCode;
        this.speed = 0;
        this.gas = 100;
    }

    // 최대 속도를 900으로 설정해주세요. 호출시 연료 3차감 , 속도 100 증가
    public void fly(){
        if(this.gas - 3 < 0){
            System.out.println("연료 부족으로 가속 불가!");
            return;
        }
        if(this.speed + 100 >= 900){ //
            this.speed = 900;
            this.gas -= 3;
            System.out.println("이미 최고속도 입니다.");
            return;
        }
        this.speed += 100;
        this.gas -= 3;
    }

    // 계기판을 보는 메서드입니다. 현재 비행기 상태를 콘솔에 찍게 작성해주세요
    public void showStatus(){
        System.out.println("현재 속도 : "+this.speed);
        System.out.println("현재 연료 : "+this.gas);
        System.out.println("비행중인 편명 : "+this.planeCode);
    }
}