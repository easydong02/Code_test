package Baekjoon;

import java.util.Scanner;

public class Bj2902 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		String names = sc.nextLine();
		
		String[] arr = names.split("-");
		
		StringBuilder sb= new StringBuilder();
		
		for (int i = 0; i < arr.length; i++) {
			sb.append(arr[i].substring(0, 1));
		}
		
		System.out.println(sb.toString());
	}

}
