package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj1032 {
	static int N;
	static char[] arr;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		N= Integer.parseInt(br.readLine());
		if(N==1) {
			System.out.println(br.readLine());
			System.exit(0);
		}
		else {
			for (int i = 0; i < N; i++) {
				char[] temp = br.readLine().toCharArray();
				if(i!=0) {
					for (int j = 0; j < temp.length; j++) {
						if(arr[j]!=temp[j]) {
							arr[j]='?';
						}
					}
				}else {
					arr= temp;
				}
			}
		}
		
		StringBuilder sb= new StringBuilder();
		
		for(char a :  arr) {
			sb.append(a);
		}
		System.out.println(sb.toString());
	}

}
