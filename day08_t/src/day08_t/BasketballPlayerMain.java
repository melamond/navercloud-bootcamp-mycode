package day08_t;

public class BasketballPlayerMain {

	public static void main(String[] args) {
		// 농구선수를 둘 만들어주세요.
		// 하나는 덩크슛에 성공하게
		// 하나는 실패하게 만들어주세요.
		BasketballPlayer b1 = new BasketballPlayer();
		BasketballPlayer b2 = new BasketballPlayer();
		
		b1.name = "김농구";
		b1.age = 10;
		b1.height = 199;
		b1.salary = 20000000;

		b2.name = "박슈팅";
		b2.age = 20;
		b2.height = 170;
		b2.salary = 10000000;
		
		b1.showInfo();
		
		b1.dunkShoot();
		
		b2.showInfo();
		
		b2.dunkShoot();

	}

}
