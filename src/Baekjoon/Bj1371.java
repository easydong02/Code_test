package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Bj1371 {
	static int[] arr;
	static int max = Integer.MIN_VALUE;
	public static void main(String[] args) throws IOException {
		arr= new int[26];
		
//		System.out.println((char)(0+'a'));
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		String str;
		while((str= br.readLine()) != null) {
			char[] tmp = str.toCharArray();
			for (int i = 0; i < tmp.length; i++) {
				if(tmp[i] !=' ') {
					arr[tmp[i]-'a']++;
				}
			}
		}
		ArrayList<Integer> list = new ArrayList<>();
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max) {
				list = new ArrayList<>();
				list.add(i);
				max= arr[i];
			}else if (arr[i]==max) {
				list.add(i);
			}
		}
		
		for (int i = 0; i < list.size(); i++) {
			result.append((char)(list.get(i)+'a'));
		}
		System.out.println(result.toString());
	}

}
