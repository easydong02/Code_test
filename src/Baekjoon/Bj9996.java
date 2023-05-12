package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj9996 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		String pattern = br.readLine();
		int idx = pattern.indexOf("\\*");
		String[] patterns = pattern.split("\\*");
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < n; i++) {
			String tmp = br.readLine();
			
			if(tmp.endsWith(patterns[1]) && tmp.startsWith(patterns[0]) && tmp.length()>=(patterns[0].length()+patterns[1].length())) {
				result.append("DA\n");
			}else {
				result.append("NE\n");
			}		
		}
		System.out.println(result.toString());
	}

}
