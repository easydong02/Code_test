package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj10953 {
	static int N;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		N= Integer.parseInt(br.readLine());
		StringBuilder sb= new StringBuilder();
		for (int i = 0; i < N ; i++) {
			char[] arr= br.readLine().toCharArray();
			int a= arr[0]-'0';
			int b= arr[2]-'0';
			
			sb.append(a+b+"\n");
		}
		
		System.out.println(sb.toString());
	}

}
