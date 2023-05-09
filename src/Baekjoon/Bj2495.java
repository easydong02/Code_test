package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj2495 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < 3; i++) {
			String str= br.readLine();
			int sum = 1;
			int max = Integer.MIN_VALUE;
			for (int j = 0; j < str.length()-1; j++) {
				char tmp1 = str.charAt(j);
				char tmp2 = str.charAt(j+1);
				if(tmp1 == tmp2) {
					sum ++;
					max = Math.max(max, sum);
				}else {
					sum = 1;
				}
			}
			if(max == Integer.MIN_VALUE) {
				result.append(1+"\n");
			}else {
				result.append(max+"\n");
			}
		}
		System.out.println(result.toString());
	}

}
