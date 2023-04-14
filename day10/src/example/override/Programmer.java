package example.override;

public class Programmer extends Human{
    public int career;
    public String proLang;

    public void 코딩하기(){
        System.out.println("코딩 중 ...");
        System.out.println("사용 언어 : " + proLang);
        System.out.println("경력 : " + career);
    }

    public void 자기소개하기(){
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println(proLang + " " + career + " 년차 개발자");
    }
}
