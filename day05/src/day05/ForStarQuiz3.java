package day05;

import java.util.Scanner;

public class ForStarQuiz3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int a = n; a >= 1; a--) {
			
			for(int i = 1; i <= n; i++) {
				if(i>=a) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
