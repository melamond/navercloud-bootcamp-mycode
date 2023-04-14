package day04;

import java.util.*;

public class WhileQuiz {
	public static void main(String[] args) {
		// 컴퓨터랑 스무고개로 숫자 맞추기를 해보겠습니다
		/* 수정
		 * 1. 0~100인 범위를 0~사용자가 입력한 값 으로 설정할수있게
			코드를 고쳐주세요.
		
			2. 위에 적힌 범위를 벗어나는 숫자가 들어오면 
			다시 입력받게 해주세요.
		
			3. 몇 번 시도끝에 맞췄는지 정답 확인시 알려주도록 해 주세요.
		 */
		
		// 이 프로그램은 먼저 Math.random()을 이용해 수를 하나 얻습니다
		int comValue = (int)(Math.random()*101); //0 ~ 100 숫자
		int count = 1;
		// 스캐너를 생성해주세요
		Scanner sc = new Scanner(System.in);
		
		System.out.println("최대 범위를 입력해주세요");
		
		int maxValue = sc.nextInt() + 1;
		
		System.out.println("0 ~" + (maxValue - 1) +"사이의 숫자를 입력해주세요");
		
		// 사용자에게 숫자를 입력받게 해주세요
		// 자바에서는 연속해서 변수를 선언하는것이 불가능하므로
		// 반복문 이전에 선언해주고 반복문 내부에서는 변수값만 바꾸기
		int userValue = -1; // 범위 밖으로 설정
		do {
			userValue = sc.nextInt();
		}while(userValue >(maxValue - 1) || userValue < 0);
		
		
		// 컴퓨터의 값과 유저의 값이 일치해야만 종료하므로 불일치시에는 계속 진행하도록
		while(comValue != userValue) {
			count += 1;
			// 불일치라면 먼저 업인지 다운인지 알려주기
			// comValue와 userValue의 비교를 통해 업다운을 판단
			if(comValue > userValue) {
				System.out.println("컴퓨터의 값이 더 높습니다");
			}else {
				System.out.println("컴퓨터의 값이 더 낮습니다");
			}
			//사용자한테 userValue를 다시 입력받기
			do {
				System.out.println("다시 입력해주세요.");
				userValue = sc.nextInt();
			}while(userValue >(maxValue - 1) || userValue < 0);
		} //while
		System.out.println("정답입니다!");
		System.out.println("시도 횟수 : " + count);
	}
}
