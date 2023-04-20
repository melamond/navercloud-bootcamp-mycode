package collection.map;

import java.util.*;

public class HashMapLogInQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> account = new HashMap<>();

        System.out.println("ID 등록 - : ");
        String id = sc.next();
        System.out.println("PW 등록 - : ");
        int pw = sc.nextInt();

        account.put(id,pw);
        //System.out.println(account);

        System.out.println("아이디와 비밀번호를 입력해 주세요.");
        id = sc.next();
        pw = sc.nextInt();

        if(!account.containsKey(id)){
            System.out.println("아이디가 틀렸습니다.");
        } else if (!account.containsValue(pw)) {
            System.out.println("비밀번호가 틀렸습니다.");
        } else {
            System.out.println("로그인에 성공했습니다.");
        }
    }
}
