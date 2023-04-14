package day02;

public class UnaryExample {

	public static void main(String[] args) {
		// 증감연산자 ++, --
		int i = 1;
		int j = i++; //후위연산자는 먼저 해당코드를 수행하고 뒤늦게 연산자 로직을 수행한다
		// int j = i (i=1)
		// i++ (i=2)
		// 최종적으로 j=1, i=2
		
		System.out.println(i);
		System.out.println(j);
		System.out.println("--------");
		
		int x = 1;
		int y = ++x;
		// i++ (i=2)
		// int y = x (i=2)
		// 최종적으로 x = 2, y = 2
		
		System.out.println(x);
		System.out.println(y);
	}
}
