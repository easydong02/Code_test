package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj5586 {

	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		String str= br.readLine();
		int a=0;
		int b=0;
		for (int i = 0; i < str.length()-2; i++) {
			if(str.charAt(i) == 'J') {
				if(str.substring(i,i+3).equals("JOI")) {
					a++;
				}
			}else if(str.charAt(i) =='I') {
				if(str.substring(i,i+3).equals("IOI")) {
					b++;
				}
			}
		}
		System.out.println(a);
		System.out.println(b);
	}

}
