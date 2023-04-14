package example.modi.cls.pack2;
import example.modi.cls.pack1.B;
import example.modi.cls.pack1.*;

public class C {
    //클래스 B는 public 이므로 패키지가 달라도 생성 가능
    //패키지 다른 경우 import 구문이 선언되어야 한다
    B b = new B();

    // 클래스 A 는 default 접근제한자를 적용받아 패키지가 다르면 호출이 불가
    //A a = new A();
}
