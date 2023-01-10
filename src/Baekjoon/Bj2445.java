package Baekjoon;

import java.util.Scanner;

public class Bj2445 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int M = 2*N-1;
		
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < -1*Math.abs(i-M/2)+1+M/2; j++) {
				System.out.print("*");
			}
			
			for (int j = 0; j < 2*Math.abs(i-M/2); j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < -1*Math.abs(i-M/2)+1+M/2; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
