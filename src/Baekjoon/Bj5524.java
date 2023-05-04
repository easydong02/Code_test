package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj5524 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < n; i++) {
			String str = br.readLine().toLowerCase();
			result.append(str+"\n");
		}
		System.out.println(result.toString());
	}

}
