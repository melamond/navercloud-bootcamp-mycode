package day04;

public class ParseIntExample {
	public static void main(String[] args) {
		//문자이지만 숫자로만 이루어진 문자는 int형으로 교환가능
		String str = "2002";
		
		//Integer.parseInt(교환할문자)
		int year = Integer.parseInt(str);
		
		System.out.println(str + 1); //20021 (문자에 정수1을 추가로 출력했을 뿐임)
		System.out.println(year + 1); //2003	
		
		String str2 = "abcd"; //숫자로 바꿀수 없는 문자열
		Integer.parseInt(str2); //숫자로 교환이 불가능하므로 에러발생
	}
}
