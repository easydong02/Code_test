package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj10102 {
	private static final String TIE = "Tie";
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		br.readLine();
		
		String str= br.readLine();
		int a = 0;
		int b = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if(str.substring(i,i+1).equals("A")) {
				a++;
			}else {
				b++;
			}
		}
		
		System.out.println(a>b? "A": a==b? TIE:"B");
	}

}
