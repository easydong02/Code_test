package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj4458 {
	
	static int N;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		N= Integer.parseInt(br.readLine());
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < N; i++) {
			String str= br.readLine();
			String tmp = str.substring(0,1).toUpperCase();
			result.append(tmp);
			for (int j = 1; j < str.length(); j++) {
				result.append(str.substring(j,j+1));
			}
			result.append("\n");
		}
		System.out.println(result.toString());
	}

}
