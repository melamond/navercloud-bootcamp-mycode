package day02;

public class CastingExample2 {
	public static void main(String[] args) {
		/*
		 * 크기가 큰 데이터를 작은 데이터 타입으로 바꾸려면
		 * 반드시 캐스팅 연산자(type)를 사용하여
		 * 명시적 형 변환을 해야한다 (downcasting)
		 */
		int i = 72;
		char c = (char)i; // int ->char 는 자동변환이 되지 않으므로 char로 바꾼다는 명시 필요
		System.out.println(c);
		
		/*
		 * 강제 형변환의 경우 데이터 손실의 가능성이
		 * 있기 때문에 자동으로 처리해주지 않는다
		 */
		double d = 4.83123;
		int j = (int)d; // 소수점 아래가 소실되므로 자동변환을 허용하지 않음 4.83->4
		System.out.println(j); 
		
		/*
		 * 강제 형변환시 주의점은 해당 데이터 타입이
		 * 처리할 수 있는 범위를 넘어선 데이터를 강제로 다운캐스팅시
		 * 오버플로우가 일어난다
		 */
		int k = 1024;
		byte b = (byte)k; // -128~127
		System.out.println(b);
		
	}
}
