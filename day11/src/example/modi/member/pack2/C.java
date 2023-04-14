package example.modi.member.pack2;

import example.modi.member.pack1.A;

public class C {
    public C(){
        A a = new A();

        a.a = 1; //pub 어디서나 접근 가능
        //a.b = 2; //def 패키지 다르면 접근 불가
        //a.c = 3; //pri 파일 다르면 접근 불가

        a.method1();
        //a.method2();
        //a.method3();
    }
}
