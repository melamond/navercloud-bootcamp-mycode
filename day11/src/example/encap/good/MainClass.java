package example.encap.good;

public class MainClass {
    public static void main(String[] args) {
        MyBirthday mb = new MyBirthday(2025, 16, 99);

        // 접근제한자 private 이므로 직접수정불가
        //mb.day = 1026;
        //mb.month = 96;
        //mb.year = 9999;

        mb.showDateInfo();
        System.out.println(mb.getDay());
        // 참고 : 조회 조차 해서는 안되는 것들은 getter를 만들지 않음
    }
}
