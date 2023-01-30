package Baekjoon;

import java.util.Scanner;

public class Bj10988 {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String word = sc.nextLine();
		boolean result =true;
		char[] arr= word.toCharArray();
		for (int i = 0; i <= arr.length/2; i++) {
			if(arr[i] != arr[arr.length-i-1]) {
				result =false;
				break;
			}
		}
		
		if(result)System.out.println(1);
		else System.out.println(0);
	}

}
