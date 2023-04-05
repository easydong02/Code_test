package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj1919 {
	
	static int[] arr1;
	static int[] arr2;
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		char[] str1= br.readLine().toCharArray();
		char[] str2= br.readLine().toCharArray();		
		arr1= new int[26];
		arr2= new int[26];
		
		int result = 0;
		for (int i = 0; i < str1.length; i++) {
			arr1[str1[i]-'a']++;
		}
		for (int i = 0; i < str2.length; i++) {
			arr2[str2[i]-'a']++;
		}
		
		for (int i = 0; i < arr1.length; i++) {
			result += Math.abs(arr1[i]-arr2[i]);
		}
		
		System.out.println(result);
	}

}
