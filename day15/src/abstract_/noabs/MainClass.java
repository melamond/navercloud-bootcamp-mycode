package abstract_.noabs;

public class MainClass {
    public static void main(String[] args) {
        // 2가지 문제 체크

        //1. 상속 목적으로 만든 팝업스토어의 생성이 가능해져 버림
        PopupStore ps = new PopupStore();

        //2. 오버라이딩 강요가 되지않아서 오버라이딩 필요한 메소드 누락
        Store s = new Store();
        s.orderApple(); // 가격 책정됨
        s.orderOrange(); // 가격 책정됨
        s.orderGrape(); // 가격 누락됨
    }
}
