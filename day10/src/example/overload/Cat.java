package example.overload;

public class Cat {
    public String breed;
    public String name;

    public Cat(){ // void생성자 : 파라미터에 입력된 자료가 없는경우
        breed = "알 수 없음";
        name = "알 수 없음";
    }

    public Cat(String b, String n){
        breed = b;
        name = n;
        System.out.println("지금부터 이 아이의 이름은 "+ n + "입니다");
    }

    public void Call(){
        System.out.println("야옹아 이리와");
    }

    public void Call(String name){
        System.out.println(name + "아 이리와");
    }
}
