package example.modi.constructor.pac1;

public class B {

    A a1 = new A(false); // public 호출됨
    A a2 = new A(55); // default 호출됨
   // A a3 = new A("안됨"); // private는 A 안에서만 호출 가능
}
