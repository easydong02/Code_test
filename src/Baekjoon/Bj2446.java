package Baekjoon;

import java.util.Scanner;

public class Bj2446 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		int N = sc.nextInt();
		int M =2*N -1;
		
		
		for (int i = 0; i < M; i++) {
			int j=0;
			for(j=0; j<-1*Math.abs(i-M/2)+M/2; j++) {
				System.out.print(" ");
			}
			for(int h=0; h<M-2*j; h++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
