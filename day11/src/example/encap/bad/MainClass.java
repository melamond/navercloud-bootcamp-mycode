package example.encap.bad;

public class MainClass {
    public static void main(String[] args) {
        MyBirthday b = new MyBirthday();

        b.year = 2023;
        b.month = 13; // 13월을 넣어도 동작
        b.day = 32; // 32일을 넣어도 동작

        b.showDateInfo();
    }
}
