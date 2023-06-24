package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Bj10819 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		StringTokenizer st= new StringTokenizer(br.readLine());
		
		for (int i = 0; i < n; i++) {
			arr[i]= Integer.parseInt(st.nextToken());
		}// end of reading
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int result = 0;
		for (int i = 0; i < arr.length/2; i++) {
			result += (arr[arr.length-i-1]-arr[i]);
		}
		System.out.println(result);
		
	}

}
