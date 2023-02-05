package Baekjoon;

import java.util.Scanner;

public class Bj1212 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str= sc.nextLine();
		
		String[] arr = {"000","001","010","011","100","101","110","111"};
		
		StringBuilder sb= new StringBuilder();
		
		for (int i = 0; i < str.length(); i++) {
			sb.append(arr[str.charAt(i)-'0']);
		}
		
		if(str.equals("0")) {
			System.out.println(str);
		}else {
			while(sb.charAt(0)=='0') {
				sb.deleteCharAt(0);
			}
			System.out.println(sb.toString());
		}
	}

}
