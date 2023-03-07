package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj1120 {
	static int result = Integer.MAX_VALUE;
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		String str= br.readLine();
		String word1= str.split(" ")[0];
		String word2= str.split(" ")[1];
		
		if(word1.length() == word2.length()) {
			result = go(word1,word2);
		}else {
			for (int i = 0; i <= word2.length()-word1.length(); i++) {
				result = Math.min(result, go(word1, word2.substring(i,i+word1.length())));
			}
		}
		
		System.out.println(result);
	}

	private static int go(String word1, String word2) {
		int sum = 0;
		for (int i = 0; i < word1.length(); i++) {
			if(!word1.substring(i,i+1).equals(word2.substring(i,i+1))) {
				sum++;
			}
		}
		
		return sum;
	}

}
