package day05;

import java.util.Scanner;

public class ForStarQuiz2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = n; i >= 1; i--) {
			for(int t = i; t > 0; t--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
