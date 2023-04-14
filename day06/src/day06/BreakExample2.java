package day06;

public class BreakExample2 {
	public static void main(String[] args) {
		
		/*
		 * 내부 반복문에서 break를 사용하여 바깥 반복문까지 
		 * 한번에 종료시키려면 외부 반복문에 label
		 */
		
		// outer 라는 이름의 label
		outer : for(int i = 1; i < 5; i++) {
			for(int j = 1; j < 5; j++) {
				System.out.println(i + "," + j);
				if(i == 2 && j == 3) {
					break;  // outer;
				}
			}
		}
	}
}
