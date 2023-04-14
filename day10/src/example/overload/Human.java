package example.overload;

public class Human {
    public String name;
    public int age;

    public Human(String n, int a) {
        name = n;
        age = a;
    }

    public Human() {
        name = "이름을 입력하지 않았음";
        age = 0;
    }
}