package Baekjoon;

import java.util.Scanner;

public class Bj10870 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int a = 0;
		int b = 1;
		int c = 0;
		while (N>1) {
			c = a+b;
			a = b;
			b = c;
			N--;
		}
		
		if(N!=0) {
			
			System.out.println(b);
		}else {
			System.out.println(0);
		}

	}

}
