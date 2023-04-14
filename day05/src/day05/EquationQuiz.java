package day05;

public class EquationQuiz {
	public static void main(String[] args) {
		
		int result = 0;
		for(int x=1; x<=60; x++) { // <15
			for(int y=1; y<=60; y++) { // <12
				result = (4 * x) + (5 * y);
				if(result == 60) {
					System.out.println("4 * " + x + " * 5 * " + y + " = " + result);
					System.out.println("x = " + x);
					System.out.println("y = " + y);
				}
			}
		}
	}
}
