package day06;

public class LunchMenu {
	public static void main(String[] args) {
		String[] lunch = {"굶기", "한식뷔페", "초밥", "비빔밥", "제육덮밥", "치킨"};
		
		int ran = (int)(Math.random()*6) + 1;
		
		System.out.println("오늘 점심은" + lunch[ran]);
	}
}
