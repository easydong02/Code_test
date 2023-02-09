package Baekjoon;

import java.util.Scanner;

public class Bj2754 {

	public static void main(String[] args) {
		String a = new Scanner(System.in).nextLine();
		double result=0;
		char[]arr= a.toCharArray();
		if(arr[0]=='A') {
			result= 4.0;
		}else if(arr[0]=='B') {
			result=3.0;
		}else if(arr[0]=='C') {
			result=2.0;
		}else if(arr[0]=='D') {
			result =1.0;
		}else {
			result= 0.0;
		}
		
		if(arr[0] !='F') {
			if(arr[1]=='+') {
				result +=0.3;
			}else if (arr[1]=='-') {
				result -=0.3;
			}
		}
		
		System.out.println(result);
	}

}
