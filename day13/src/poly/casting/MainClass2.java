package poly.casting;

public class MainClass2 {
    public static void main(String[] args) {
        // Parent 타입에는 Child, Child2 모두 대입 가능
        Parent p1 = new Child();
        p1.method2();
        // Child1, 2 모두 Method 2 호출 가능
        p1 = new Child2();
        p1.method2();
        // 오버라이딩 안된 Method 3 호출 불가
        //p1.method3();
        //p2.method3();

        Child c1 = new Child();
        // Parent 타입과 달리 Child는 Child인스턴스만 대입가능
        //Child c2 = new Child2();
    }
}
