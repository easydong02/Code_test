package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj9093 {
	
	static int N;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < N; i++) {
			String[] arr= br.readLine().split(" ");
			StringBuilder semiresult= new StringBuilder();
			for(String word: arr) {
				char[] temp = word.toCharArray();
				StringBuilder parts = new StringBuilder();
				for (int j = temp.length-1; j >=0; j--) {
					parts.append(temp[j]);
				}
				semiresult.append(parts+" ");
			}
			result.append(semiresult+"\n");
		}
		System.out.println(result.toString());
	}

}
