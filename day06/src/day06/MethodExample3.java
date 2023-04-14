package day06;

public class MethodExample3 {
	
	public static void cat() {
		System.out.println("\\    /\\");
		System.out.println(" )  ( ')");
		System.out.println("(  /  )");
		System.out.println(" \\(__)|");
	}
	
	public static int eat(int x) {
		int meal = 5000;
		int total = 0;
		for(int i=0; i<x; i++) {
			total = meal * i;
		}
		return total;
	}
	
	public static void catName(String name, int a) {
		System.out.println("고양이 이름은 : " + name);
		System.out.println("고양이 나이는 : " + a);
		System.out.println("고양이 사료는 " + eat(a));
	}
	
	public static void main(String[] args) {
		cat();
		eat(5);
		catName("꼬맹이",12);
	}
}
