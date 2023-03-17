package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj11365 {

	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		String str;
		StringBuilder result = new StringBuilder();
		while(!(str = br.readLine()).equals("END")) {
			for (int i = str.length()-1; i >=0; i--) {
				result.append(str.substring(i,i+1));
			}
			result.append("\n");
		}
		System.out.println(result.toString());
	}

}
