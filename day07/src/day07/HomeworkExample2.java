package day07;

public class HomeworkExample2 {

	
	public static void main(String[] args) {
		//리스트사용방식
		//메뉴설정
		String[] menu = {"대창덮밥", "돈카츠", "도삭면", "선지해장국", "수제비", "보쌈정식"};
		
		//난수구하기
		int idx = (int)(Math.random()*menu.length);
		System.out.println(menu[idx]);
	}
	
}
