package example.this_.car;

public class Car {
    public String model;
    public int speed;

    public Car(String model){ // 생성자
        this.model = model;
        this.speed = 0; // 중복 값이 없기 때문에 반드시 작성할 필요는 없다.
    }

    public void accel(){ // 메소드
        if (this.speed + 10 >= 150){
            this.speed = 150;
        }else {
            this.speed += 10;
        }
    }

    public void showStatus(){
        System.out.println("모델명 : " + this.model);
        System.out.println("현재 속도 : " + this.speed);
    }
}


