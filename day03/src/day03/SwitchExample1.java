package day03;

import java.util.*;

public class SwitchExample1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("메뉴를 번호로 입력해주세요");
		System.out.println("1. 카페라떼 2. 아메리카노 3. 녹차프라푸치노");
		int order = sc.nextInt();
		
		switch (order) {
			case 1: 
				System.out.println("주문하신 카페라떼가 나왔습니다");
				break; // break 구문을 case 마지막에 작성해야 코드가 흘러내리지 않음
			case 2: 
				System.out.println("주문하신 아메리카노가 나왔습니다");
				break;
			
			case 3:
				System.out.println("주문하신 녹차프라푸치노가 나왔습니다");
				break; //마지막 case에는 원래 break를 잘 안달지만 가독성 문제로 달기도함
			 default:
				 System.out.println("주문하신 상품은 없는 상품입니다");
		}
	}
}