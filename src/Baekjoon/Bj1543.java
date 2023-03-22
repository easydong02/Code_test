package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj1543 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		String str2 = br.readLine();
		int result = 0 ;
		for (int i = 0; i < str1.length(); i++) {
			if((i+str2.length()-1 <str1.length())  &&str1.substring(i,i+str2.length()).equals(str2)) {
				result ++;
				i+= str2.length()-1;
			}
		}
		System.out.println(result);
	}

}
