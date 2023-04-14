package day04;

public class WhileExample {
	public static void main(String[] args) {
		// while 반복문 로직 파악 예시
		
		int count = 0; // 더 진행할지 말지 결정할 변수 (제어변수)
		while(count < 3) {
			count++;
			System.out.println("While이 실행중입니다." + count);
		}
		// 반복문을 종료할지는 8번의 조건식에서 결정
		// count가 3이 되는 것은 반복문 안이다
		// 반복문 내에서 3이 되더라도 중간에 종료되지 않는다
	}
}
