package day05;

import java.util.Iterator;

public class NestedForExample {
	public static void main(String[] args) {
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print("*"); //println 이 아
			}//내부 for문 (j)
			System.out.println();//줄바꿈만 수
		}//외부for문 (i)
	}
}
