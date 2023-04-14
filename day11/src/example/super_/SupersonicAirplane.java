package example.super_;

public class SupersonicAirplane extends Airplane {

    // 상속받는 멤버 변수 없음

    public SupersonicAirplane(String planeCode){
        super(planeCode); // 현 구조에서는 Airplane의 생성자 호출
    }

    // 초음속 비행기도 fly()를 사용해야 하므로 오버라이딩
    // 다만 시속 900 이하에서는 일반비행을 그 이후에는 초음속 비행을 하므로
    // 900km 이하 구간에서는 오버라이딩 전 fly를, 이후에는 재정의된 fly를 실행해야 한다
    @Override
    public void fly(){
        if(this.speed < 900){
            super.fly();
        }else if(this.speed + 300 <= 2200 && this.gas >= 5){
            this.speed += 300;
            this.gas -= 5;
        } else if (this.speed + 300 >= 2200 && this.gas >= 5) {
            this.speed = 2200;
            this.gas -= 5;
        } else{
            System.out.println("연료가 부족합니다");
        }
    }
}
