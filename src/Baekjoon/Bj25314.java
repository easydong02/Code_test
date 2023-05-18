package Baekjoon;

import java.util.Scanner;

public class Bj25314 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int n = sc.nextInt();
		
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < n/4; i++) {
			result.append("long ");
		}
		
		result.append("int");
		
		System.out.println(result.toString());
	}

}
