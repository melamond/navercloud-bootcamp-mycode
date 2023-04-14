package day03;

public class IfExample {
	public static void main(String[] args) {
		// 0~100까지의 int 난수를 score에 저장
		// 아래 문장에 math.random() *101을 괄호로 감싸는것과 안감싸는것의 
		// 차이가 있는데 문제점과 원인이 무엇인지 도출하기
		int score = (int)(Math.random()*101);
		
		/*
		 *  if문을 작성해 보겠습니다
		 *  if(조건식){
		 *  	실행구문;
		 *  }
		 */
		if (score >= 60) {
			System.out.println(score);
			System.out.println("당신은 합격했습니다! 축하합니다");
		}
		else {
			System.out.println(score);
			System.out.println("당신은 불합격했습니다.");
		}
	}
}
