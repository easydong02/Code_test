package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj9086 {
	static int T;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringBuilder result = new StringBuilder();
		
		T= Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			String str = br.readLine();
			result.append(str.substring(0,1));
			result.append(str.substring(str.length()-1,str.length())+"\n");
		}
		
		System.out.println(result.toString());
	}

}
