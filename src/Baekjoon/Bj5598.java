package Baekjoon;

import java.util.Scanner;

public class Bj5598 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		char[] arr= sc.nextLine().toCharArray();
		StringBuilder result =new StringBuilder();
		
		
		
		for (int i = 0; i < arr.length; i++) {
			int tmp = arr[i];
			if(tmp>67) {
				arr[i] = (char)((int)arr[i]-3);
			}else {
				arr[i] = (char)(((int)arr[i]-3)+26);
			}
		}
		System.out.println(new String(arr));
	}

}
