package Baekjoon;

import java.util.Scanner;

public class Bj10808 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		char[]arr= sc.nextLine().toCharArray();
		
		int[] results = new int[123];
		
		
		for (int i = 0; i < arr.length; i++) {
			results[arr[i]-0]++;
		}
		
		StringBuilder sb= new StringBuilder();
		
		for (int i = 97; i < results.length; i++) {
			sb.append(results[i]+" ");
		}
		
		System.out.println(sb.toString());
	}

}
