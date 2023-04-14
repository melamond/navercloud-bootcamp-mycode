package example.overload;

public class CatMain {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        System.out.println(c1.breed);
        System.out.println(c1.name);
        c1.Call();

        System.out.println("--------------");
        Cat c2 = new Cat("코숏", "꼬맹이");
        System.out.println(c2.breed);
        System.out.println(c2.name);
        c2.Call();
        c2.Call("꼬맹이");

    }
}
