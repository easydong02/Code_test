package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj1373 {

	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		String str= br.readLine();
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < str.length()%3; i++) {
			str= "0"+str;
		}
		
		for (int i = 0; i < str.length(); i+=3) {
			int tmp = Integer.parseInt(str.substring(i,i+1))*4 + Integer.parseInt(str.substring(i+1,i+2))*2+ Integer.parseInt(str.substring(i+2,i+3))*1 ;
			result.append(tmp);
		}
		System.out.println(result.toString());
	}

}
