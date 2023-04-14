package poly.inheri;

public class MainClass1 {
    public static void main(String[] args) {
        Warrior w1 = new Warrior("ㅁㄴㅇㄹ");
        Rabbit rabbit1 = new Rabbit();
        Rat rat1 = new Rat();

        Magician m1 = new Magician("asdf");
        m1.castFireBall(rabbit1);
        m1.showStatus();
        m1.castFireBall(rat1);
        m1.showStatus();
        m1.hunt(rat1);
        m1.showStatus();
    }
}
