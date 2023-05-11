package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Bj16916 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		String str2 = br.readLine();
		
		System.out.println(KMP(str1,str2));
	}

	private static int KMP(String parent, String pattern) {
		int n = pattern.length();
		int[] table = new int[n];
		table = makeTable(pattern);
		
		int idx = 0;
		for (int i = 0; i < parent.length(); i++) {
			while(idx>0 && parent.charAt(i) != pattern.charAt(idx)) {
				idx = table[idx-1];
			}
			
			if(parent.charAt(i) == pattern.charAt(idx)) {
				if(idx == pattern.length()-1) {
					return 1;
				}else {
					idx ++;
				}
			}
		}
		
		return 0;
	}

	private static int[] makeTable(String pattern) {
		int table[] = new int[pattern.length()];
		int idx = 0;
		
		for (int i = 1; i < table.length; i++) {
			while(idx>0 && pattern.charAt(i) != pattern.charAt(idx)) {
				idx = table[idx-1];
			}
			
			if(pattern.charAt(i) == pattern.charAt(idx)) {
				table[i] = ++idx;
			}
		}
		
		
		return table;
	}

}
