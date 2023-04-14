package day06;

public class ContinueExample1 {
	public static void main(String[] args) {
		//짝수만 출력하는 Continue 에서
		for(int i=1; i<11; i++) {
			if(i%2!=0) {
				// i 가 홀수인 경우
				continue; // 해당 바퀴를 스킵하고 시작으로 이동
			}
			System.out.println(i);
		}
	}
}
