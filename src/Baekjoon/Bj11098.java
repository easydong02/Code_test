package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj11098 {
	
	static int N,MAX=Integer.MIN_VALUE;
	static String RESULT;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		N= Integer.parseInt(br.readLine());
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < N; i++) {
			MAX=Integer.MIN_VALUE;
			RESULT="";
			int n = Integer.parseInt(br.readLine());
			for (int j = 0; j < n; j++) {
				String[] arr = br.readLine().split(" ");
				int price = Integer.parseInt(arr[0]);
				if(price>MAX) {
					MAX = price;
					RESULT= arr[1];
				}
			}
			result.append(RESULT+"\n");
		}
		System.out.println(result.toString());
	}

}
