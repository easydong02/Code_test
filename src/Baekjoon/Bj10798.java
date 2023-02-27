package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Bj10798 {
	
	static char[][] words;
	static int maxL= Integer.MIN_VALUE;
	public static void main(String[] args) throws IOException {
		words = new char[5][];
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		for (int i = 0; i < 5; i++) {
			char[] tmp= br.readLine().toCharArray();
			words[i]= tmp;
			maxL= Math.max(maxL, tmp.length);
		}//end of reading
		
//		for(char[] a : words) {
//			System.out.println(Arrays.toString(a));
//		}
		
		StringBuilder sb= new StringBuilder();
		
		
		for (int i = 0; i < maxL; i++) {
			for (int j = 0; j < 5; j++) {
				if(words[j].length>i) {
					sb.append(words[j][i]);
				}
			}
		}
		
		System.out.println(sb.toString());
	}

}
