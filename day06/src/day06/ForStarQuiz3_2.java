package day06;

public class ForStarQuiz3_2 {
	/*      *
	 *     **
	 *    ***
	 *   **** 
	 *  *****
	 */
	public static void main(String[] args) {
		// 중첩반복문 쓰되 if문으로 " " + "*"
		
		for(int i = 1; i <= 5; i++) {
			for(int k = 1; k <= 5; k++) {
				if(i <= 5-k) { // i = * (1~5) / k = " " (5-k = 4~0)
					// i의 값은 고정이고 5-k로 1부터 5까지 돌렸을 때 첫텀에 4개가 true가 오게
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
