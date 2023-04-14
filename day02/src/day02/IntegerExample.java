package day02;

public class IntegerExample {
	public static void main(String[] args) {
		
		int maxInt = 2147483647;
		// 011111111 11111111 11111111 11111111
		// 000000000 00000000 00000000 00001010
		// 1 ~~~ Overflow
		System.out.println(maxInt + 10);
		
		int minInt = -2147483648;
		// 최저에서 1을 빼면 반대로 최대값으로 바뀐다
		
		System.out.println(minInt - 1);
	}
}
