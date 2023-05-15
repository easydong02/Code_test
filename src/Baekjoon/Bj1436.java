package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj1436 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		long num = 0;
		while(n >0) {
			num++;
			if(String.valueOf(num).contains("666")) {
				n--;
			}
		}
		System.out.println(num);
	}


}
