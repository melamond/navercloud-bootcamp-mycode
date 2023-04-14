package day03;
import java.util.*;

public class ScannerExample {
	public static void main(String[] args) {
		// Scanner 란 프로그램 실행후 사용자에게 입력받는 기능
		
		// 1. 스캐너 객체 생성
		Scanner sc = new Scanner(System.in);
		
		// 2. 스캐너 클래스가 가진 입력 기능을 이용해 값을 입력받음
		System.out.println("이름을 입력해주세요");
		String userName = sc.next(); //int를 입력받을 때는 sc.nextInt();
		
		System.out.println("안녕하세요" + userName + "님!");
		
		// 3. 사용한 스캐너는 종료시킨다
		sc.close();
	}
}
