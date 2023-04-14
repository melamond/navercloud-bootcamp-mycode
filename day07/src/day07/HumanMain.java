package day07;

public class HumanMain {
	public static void main(String[] args) {
		// 타클래스에 정의된 요소를 main 내부에서 생성해 쓸 수 있습니다
		
		// new 키워드는 힙에 자료를 저장합니다
		// 자료형 변수 = new 자료형();
		// 위 명령어로 구조체의 인스턴스를 생성할수 있습니다
		// new 키워드의 리턴 자료는 해당 힙의 주소
		
		// 사람1 생성
		Human h1 = new Human();
		h1.name = "민세기";
		h1.age = 25;
		h1.height = 180;
		
		System.out.println("사람 1의 이름 : " + h1.name);
		
		// 사람2 생성
		Human h2 = new Human();
		h2.name = "유재석";
		h2.age = 40;
		h2.height = 180;
		
		System.out.println("사람 2의 키 : " + h2.height);
	}
}
