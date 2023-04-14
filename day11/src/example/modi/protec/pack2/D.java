package example.modi.protec.pack2;

import example.modi.protec.pack1.A;

public class D extends A {
    public D(){
        //A a = new A();
        //a.s = "hi";
        //a.method();

        /*
        protected는 패키지가 다를경우
        두 클래스 사이에 상속관계가 있다면
        super 키워드를 이용해 부모쪽 참조를 허용한다
         */
        super();
        super.s = "hi";
        super.method();
    }
}
