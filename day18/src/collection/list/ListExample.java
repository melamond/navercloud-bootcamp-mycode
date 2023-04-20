package collection.list;
// 셋 다 import 해야 함
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        // ArrayList 와 LinkedList 사용 양식은 전부 List를 따른다
        // 따라서 교환이 가능하다. 인터페이스가 같은 구현체들은 사용법이 같다
        // 제네릭 : 타입 안정화를 위해 객체 내부에 저장되는 타입을 일치시키는 방법
        // String만 저장할 수 있는 컬렉션
        // 기본형 자료는 제네릭에 넣을 수 없음. Wrapper 클래스만 넣을 수 있음
        //List<String> list = new ArrayList<>(); // 1.8부터는 생성자에 제네릭 표기안해도됨
        List<String> list = new LinkedList<>(); // 1.8부터는 생성자에 제네릭 표기안해도됨

        String str1 = "Java";
        String str2 = "SpringBoot";
        System.out.println(list); // 컬렉션 특성상 toString() 이 이미 재정의 되어 주소가 안나오고
        // 내부요소가 나옴

        // List에 객체를 저장하는 메소드 add() : 데이터를 마지막 지점에 추가
        list.add(str1);
        list.add(str2);
        list.add("Database");
        list.add("JDBC");
        list.add("Database"); // 중복 저장 허용
        System.out.println(list);

        int size = list.size();
        System.out.println("list 에 저장된 총 객체 수 : "+size);

        // list에 객체 삽입
        list.add(2, "Network");
        System.out.println(list);

        // list 데이터 수정
        // list[3] = "PostgreSQL"; // 일반수정 구문 사용불가
        list.set(3, "PostgreSQL");
        System.out.println(list);

        // list 내부객체 가져오기
        String s = list.get(2);
        System.out.println(s);

        // list 내부 저장된 객체 인덱스번호 확인
        int idx = list.indexOf("Networ"); // 없는 자료는 -1
        System.out.println(idx);

        // list 에서 객체 데이터 삭제
        list.remove(5);
        System.out.println(list);
        list.remove(str1);
        System.out.println(list);

        // list 내부 저장 객체의 유뮤 확인
        System.out.println(list.contains(str1)); // boolean

        // list의 반복문 처리
        // 인덱스로 조회
        for (int i = 0; i < list.size(); i++){
            System.out.println("내부 요소 : "+ list.get(i));
        }
        System.out.println("==================");

        // 향상된 for문 사용가능 (List<String> 선언했으므로 String으로 받기)
        for(String str : list)
            System.out.println("내부 요소 : "+ str);

        // list 내부 전체 자료 삭제
        list.clear();
        System.out.println(list); // list 라는 박스는 살아있음

        // list 내부 데이터가 비었는지 확인하는 메소드
        System.out.println(list.isEmpty());
    }
}
