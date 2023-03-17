package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Set;

public class Bj11478_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int length = input.length();
		String[] suff_arr = new String[length];
		
		int lcp = 0;
		for (int i = 0; i < length; i++) {
			suff_arr[i] = input.substring(length - 1 - i);
		}
		Arrays.sort(suff_arr);
		for (int i = 1; i < length; i++) {
			for (int j = 0; j < suff_arr[i - 1].length(); j++) {
				if(suff_arr[i-1].charAt(j) == suff_arr[i].charAt(j)) {
					lcp++;
				}
				else {
					break;
				}
			}
		}
		int ans = (length*(length+1)/2-lcp);
		System.out.println(ans);
	}

}
