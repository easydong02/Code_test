package Baekjoon;

import java.util.Scanner;

public class Bj2441 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			
			for( int j =N-i ; j>0; j--) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
