package example.modi.cls.pack1;

// public 접근제한자는 어디서나 접근가능
public class B {
    /*
    클래스 A의 접근제한자가 default 이기때문에
    같은 패키지 내부인 B에서 A를 선언할수있습니다
     */
    A a = new A();
}
