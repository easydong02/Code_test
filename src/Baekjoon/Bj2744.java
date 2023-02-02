package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Bj2744 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String a = sc.nextLine();
		
		String[] arr= a.split("");
		char[] arr2= a.toCharArray();
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			if((int)arr2[i]<=90) {
				result.append(arr[i].toLowerCase());
			}else {
				result.append(arr[i].toUpperCase());
			}
		}
		
		System.out.println(result.toString());
	}

}
