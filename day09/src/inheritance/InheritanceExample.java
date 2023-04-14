package inheritance;

public class InheritanceExample {
	public static void main(String[] args) {
		// Student 가 Human 을 상속했기 때문에
		// 힙에 Human (부모 필드 + 메서드) 와 
		// Student (자식 필드 + 메서드 + 생성자) 모두 생성된다
		Student st1 = new Student(); 
		
		st1.name = "김학생";
		st1.age = 20;
		st1.major = "기계공학";
		
		Salaryman sm1 = new Salaryman();
		
		sm1.name = "나직장";
		sm1.age = 40;
		sm1.salary = 80000000;
	}
}
