package day04;

public class EnhanccedForExample {
	public static void main(String[] args) {
		String[] weekDay = {"일", "월", "화", "수", "목", "금", "토"};
		
		//향상된 for문은 위와같은 리스트 내부 자료를 하나씩 소비해 반복문을 실행
		//java5에서 추가된 문법
		for(String day : weekDay) { 
			System.out.println(day + "요일");
		} //전부 소비하면 종료
	}
}
