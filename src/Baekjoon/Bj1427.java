package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Bj1427 {
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		char[] arr= br.readLine().toCharArray();
		
		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
		
		StringBuilder sb= new StringBuilder();
		
		for (int i = arr.length-1; i >=0; i--) {
			sb.append(arr[i]);
		}
		
		System.out.println(sb.toString());
	}

}
