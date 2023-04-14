package day04;

public class ForQuiz {
	public static void main(String[] args) {
		//랜덤 구구단을 만들어주세요
		//구구단의 범위는 1~9까지입니다 
		//math.random()을 어떻게 활용하면 범위를 1~9로 할수있을지 생각해보아요 (hint 0~8)
		//난수로 얻은 값에 1~9로 곱한 값을 for문을 이용해 9바퀴 돌려 콘솔에 찍어주세요
		
		int a = (int)(Math.random() * 9) + 1;
		System.out.println(a);
		for(int b = 1; b<10; b++) {
			System.out.printf("%d * %d = %d 입니다. %n", a, b, (a*b) );
		}
	}
}
