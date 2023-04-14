package day03;

import java.util.*;
public class SwitchExample2 {
	public static void main(String[] args) {
		// 앞서 배운 배열과 연동해서 코드를 작성해보겠습니다
		String[] foods = {"파스타","탕수육","쌀국수","볶음밥","스시"};
		
		// 0~4범위의 난수를 얻도록 해주세요
		int idx = (int)(Math.random()*5);
		
		switch(foods[idx]) {
			// 최애 3개 요리는 case에서 체크해서
			// "XX식입니다" 라고 출력하고
			// 나머지 2개는 default로 "기타요리입니다"로 출력해주세요
			case "파스타": // case 1로 하면 String에서 int값을 찾을수 없어 오류 
				System.out.println("양식입니다");
				break;
			case "탕수육":
				System.out.println("중식입니다");
				break;
			case "스시":
				System.out.println("일식입니다");
				break;
			default:
				System.out.println("기타요리입니다");
		}
	}
}
