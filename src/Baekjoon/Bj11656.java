package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Bj11656 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		String word = sc.nextLine();
		String[] words = new String[word.length()];
		for (int i = 0; i < word.length(); i++) {
			words[i]=word.substring(i,word.length());
		}
		
//		System.out.println(Arrays.toString(words));
		
		Arrays.sort(words);
		
		StringBuilder sb= new StringBuilder();
		for(String a : words) {
			sb.append(a+"\n");
		}
		
		System.out.println(sb.toString());
	}

}
