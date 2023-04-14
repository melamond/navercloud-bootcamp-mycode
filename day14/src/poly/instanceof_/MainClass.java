package poly.instanceof_;

public class MainClass {
    public static void main(String[] args) {
        // Human, Student, Cat 인스턴스 생성
        Human h1 = new Human("김자바", 20);
        h1.showInfo();

        Student s1 = new Student("학생임", 19);
        s1.showInfo();

        Cat c1 = new Cat("룰루", 5);
        c1.meow();

        System.out.println(h1 instanceof Human);
        System.out.println(s1 instanceof Human);

        // 관련이 전혀 없는 객체간 비교는 불가능함
        // System.out.println(c1 instanceof Human); << Error

        System.out.println(h1 instanceof Student);
        System.out.println(s1 instanceof Student);

        // 관련이 전혀 없는 객체간 비교는 불가능함
        //System.out.println(c1 instanceof Student);
    }
}
