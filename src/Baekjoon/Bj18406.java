package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj18406 {
	
	private static final String OK ="LUCKY";
	private static final String NO ="READY";
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		char[] arr =br.readLine().toCharArray();
		
		
		int left = 0;
		int right =0;
		for (int i = 0; i < arr.length; i++) {
			if(i<arr.length/2) {
				left += arr[i]-'0';
			}else {
				right += arr[i]-'0';
			}
		}
		
		if(left==right) {
			System.out.println(OK);
		}else {
			System.out.println(NO);
		}
	}

}
