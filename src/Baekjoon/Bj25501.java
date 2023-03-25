package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj25501 {
	
	static int n;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Integer N = Integer.parseInt(br.readLine());
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < N; i++) {
			n = 0;
			result.append(isPalindrome(br.readLine())+" "+n+"\n");
		}
		System.out.println(result.toString());
	}

	private static int isPalindrome(String str) {
		return recursion(str,0,str.length()-1);
	}

	private static int recursion(String s, int l, int r) {
		n++;
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
	}

}
