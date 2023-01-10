package Baekjoon;

import java.util.Scanner;

public class Bj11729 {
	
	static StringBuilder sb= new StringBuilder(); 
	static int cnt;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		hanoi(N);
		System.out.println(cnt);
		System.out.println(sb.toString());
	}
	private static void hanoi(int n) {
		hanoi(n,1,3,2);  // abc
	}
	private static void hanoi(int n, int a, int b, int c) {
		cnt++;
		if(n==1) {
			sb.append(a+" "+b+"\n");
			return;
		}
		hanoi(n-1,a,c,b);
		sb.append(a+" "+b+"\n");
		hanoi(n-1,c,b,a);
		
	}

}
