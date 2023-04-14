package poly.instanceof_;

public class Cat {

    private String name;
    private int age;

    // String int 파라미터 생성자
    // name, age 자료 대입
    public Cat(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void meow(){
        System.out.println("Meow");
    }
}
