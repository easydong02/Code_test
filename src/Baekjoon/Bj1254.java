package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj1254 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str= br.readLine();
		
		for (int i = 0; i < str.length(); i++) {
			if(isPel(str.substring(i,str.length()))) {
				System.out.println(str.length()+i);
				break;
			}
		}
	}

	private static boolean isPel(String str) {
		if(str.length()==1)return true;
		
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) != str.charAt(str.length()-i-1)) {
				return false;
			}
		}
		
		return true;
	}

}
