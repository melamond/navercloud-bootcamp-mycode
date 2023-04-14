package day05;

public class BreakExample1 {
	public static void main(String[] args) {
		/*
		 * 무한루프는 보통 break와 조합해 사용한다
		 */
		int i=0;
		while(true) {
			if(i==15)
				break;//if, for, while등은 타겟 구문이 1줄이면 중괄호 필요없음
			System.out.println(i);
			i++;
		}
	}
}
