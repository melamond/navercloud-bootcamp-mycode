package strequals;

import java.util.Scanner;

public class UserMain {
	public static void main(String[] args) {
		/*
		 * 같은 클래스 안에서 동일한 문자열을 직접 대입하는 형식으로
		 * String 객체를 생성할시 같은 주소값을 공유하게 됩니다
		 */
		String s1 = "홍길동";
		String s2 = "홍길동";
		System.out.println(s1 == s2);
		
		Scanner sc = new Scanner(System.in);
		User u = new User("abcd123");
		System.out.println("비밀번호를 입력해 주세요");
		// new String()과 같은 원리로 새로 할당
		String password = sc.next(); 
		
		//if(password == u.pw) {
		if(password.equals(u.pw)) {
			System.out.println("비밀번호가 일치합니다");
		}else {
			System.out.println("비밀번호가 일치하지 않습니다");
		}
	}
}
