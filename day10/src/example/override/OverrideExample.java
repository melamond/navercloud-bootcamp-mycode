package example.override;

public class OverrideExample {
    public static void main(String[] args) {
        // 학생 클래스의 인스턴스를 생성해주세요

        Human h1 = new Human();

        h1.name = "엄준식";
        h1.age = 20;

        h1.자기소개하기();
        h1.코딩하기();
        System.out.println("------------------");

        Student s1 = new Student(); // 생성자가 없기 때문에 () 안에 못들어감

        // 값 입력
        s1.name = "민세기";
        s1.age = 25;
        s1.major = "일본어";

        s1.자기소개하기(); // 메소드로 출력

        // ------------------
        System.out.println("------------------");
        Programmer p1 = new Programmer();

        p1.career = 1;
        p1.proLang = "Java";

        p1.코딩하기();

        System.out.println("------------------");
        p1.age = 25;
        p1.name = "민세기";

        p1.자기소개하기();
    }
}
