package day07;

public class CatMain {
	
	// 고양이 조회하는 용도로 사용할 전용 메서드 작성해보기
	
	public static void showCatInfo(Cat cat) {
		System.out.println("고양이 이름: " + cat.name);
		System.out.println("고양이 나이: " + cat.age);
		System.out.println("고양이 품종: " + cat.breed);
		System.out.println("고양이 몸무게: " + cat.weight);
	}
	public static void main(String[] args) {
		// 고양이 한마리 생성해보기
		Cat c1 = new Cat();
		
		c1.name = "꼬맹이";
		c1.age = 12;
		c1.breed = "코리안숏헤어";
		c1.weight = 4;
		
		showCatInfo(c1);
		/*
		 * c2 c3를 새롭게 생성하고
		 * 이 고양이들도 showcatinfo로 조회할 때
		 * 메모리 구조가 어떻게 전개될지 직접
		 * 그려보기
		 * c1/c2/c3를 조회하는 각각의 순간 3장의 메모리구조 그림을 보내기
		 */
		
		Cat c2 = new Cat();
		c2.name = "감자";
		c2.age = 0;
		c2.breed = "터키쉬앙고라";
		c2.weight = 1;
		
		showCatInfo(c2);
		
		Cat c3 = new Cat();
		c3.name = "고구마";
		c3.age = 8;
		c3.breed = "브리티시숏헤어";
		c3.weight = 6;
		
		showCatInfo(c3);
	}
}
