package day04;

public class ForExample2 {
	public static void main(String[] args) {
		// 반복문을 이용해 100이하 수 중 7의 배수만 출력하기
		// 1. 0~100까지 돌리고 if문으로 7의 배수인 케이스만 콘솔창에 찍기
		for(int i=0; i<101; i++) { // i=0, i<n 이면 n바퀴 돌아간다
			if(i%7==0 && i != 0) {
				System.out.println(i);
			} //그러면 i<=n-1이면?
		}
	}
}
