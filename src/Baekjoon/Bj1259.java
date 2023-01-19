package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj1259 {
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			go(br.readLine());
			
		}
	}

	private static void go(String str) {
		if(str.equals("0"))System.exit(0);
		
		char[] arr = str.toCharArray();
		
		for (int i = 0; i < arr.length/2; i++) {
			if(arr[i] != arr[arr.length-i-1]) {
				System.out.println("no");
				return;
			}
		}
		System.out.println("yes");
		return;
	}

}
