package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj10807 {
	
	static int RESULT;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int [] arr =new int[n];
		
		StringTokenizer st= new StringTokenizer(br.readLine());
		
		for (int i = 0; i < n; i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		int v = Integer.parseInt(br.readLine());
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == v) {
				RESULT ++;
			}
		}
		System.out.println(RESULT);
	}

}
