package collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        // 제네릭으로 내부 자료형 결정
        Set<String> set = new HashSet<>();

        // add() : set 에 객체 추가
        set.add("닭강정");
        set.add("김밥");
        set.add("김말이");
        set.add("단무지");
        set.add("김밥"); // 중복

        // size() : 저장된 객체 수
        System.out.println("Set 에 저장된 객체 수 : " + set.size()); // 4개
        System.out.println(set);

        /*
        - Set 의 객체데이터를 사용하려면 반복자(Iterator)를 통해
        모든 객체를 대상으로 한번씩 반복해서 꺼내야 한다
         */
        Iterator<String> iter = set.iterator(); // set을 반복할 수 있도록 처리

        /*
        - 반복자 객체가 next() 메소드를 통해 set 내부 데이터를
        반복해서 소진할 때 더이상 조회할 데이터가 없다면 예외를 발생시키므로
        hasNext()를 이용해 더이상 소모할 데이터가 있는지 여부를 확인한다
         */

        while (iter.hasNext()){
            String s = iter.next();
            if (s.equals("단무지")){
                System.out.println(s);
                break;
            }
        }

        set.remove("단무지");
        System.out.println(set);

        set.clear();
        if (set.isEmpty()){
            System.out.println("Set이 비어있습니다");
        }else {
            System.out.println("Set이 비어있지 않습니다");
        }
    }
}
