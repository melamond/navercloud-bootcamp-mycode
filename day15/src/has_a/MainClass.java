package has_a;

public class MainClass {
    public static void main(String[] args) {
        // Gun은 new 키워드로 생성해야 police생성자에 전달 가능
        Gun gun = new Gun("m16", "23123");

        // gun을 사전에 생성하지 않으면 넘길 방법이 없음
        Police police = new Police(gun, "나경찰", 180);
        // Police는 Gun 이 먼저 존재해야 하는 의존관계

        police.shoot();
        police.shoot();
        police.shoot();
        police.shoot();
        police.shoot();
        police.shoot();
        police.shoot();

        police.reload();
        police.shoot();
        police.shoot();
        police.shoot();
        police.shoot();
    }
}
