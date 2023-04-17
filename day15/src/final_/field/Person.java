package final_.field;

public class Person {
    /*
    final 변수는 단 한번 초기화될수 있고
    이후 변경이 불가하기 때문에
    선언시에 직접 초기화를 해주거나,
    생성자를 통해 초기화 해주어야 한다
     */

    public final String nationality = "대한민국"; // 선언부초기화
    public final String name; // 여기서 초기화 하지 않을 경우 생성자에서 초기화해야함
    public int age; // final 아닌 멤버변수는 초기화 할 의무 없음

    public Person(String name){
        this.name = name;
    }
}
