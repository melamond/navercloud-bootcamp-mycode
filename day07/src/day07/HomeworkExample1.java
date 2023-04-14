package day07;

public class HomeworkExample1 {
	
	//main 제외 메서드 3개 정의
	
	public static void getPow(int num) {
		int result = num*num;
		System.out.println("입력된 수:" + num);
		System.out.println(num + "의제곱수:"+result);
	}

	public static void getIntroduce() {
		System.out.println("네이버클라우드 6기");
		System.out.println("기초 자바 진행중입니다");
		System.out.println("메서드 파트 진행중입니다");
	}
	
	public static void loginCheck(String id, int password) {
		if (password == 3306) {
			System.out.println(id+"님 환영합니다");
			
		}else
			System.out.println("비밀번호를 다시 확인해주세요");
	}
	
	public static void main(String[] args) {
		loginCheck("asdf", 3306);
		loginCheck("asdf", 2134);
		
		getIntroduce();
		
		getPow(59);
	}
}
