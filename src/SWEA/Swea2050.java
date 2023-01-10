package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Swea2050 {
	private static String str;
	private static char[] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		str= br.readLine();
		
		arr= str.toCharArray();
		
		for(char c: arr) {
			System.out.print(c-64 +" ");
		}
	}

}
