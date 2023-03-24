package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj10987 {
	
	static String[] arr  = { "a","e","i","o","u"};
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int result = 0 ; 
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < arr.length; j++) {
				if(str.substring(i,i+1).equals(arr[j])) {
					result ++;
					break;
				}
			}
		}
		System.out.println(result);
		
	}

}
