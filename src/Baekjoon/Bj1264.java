package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj1264 {
	
	static String[] moeum = {"a","e","i","o","u","A","E","I","O","U"};
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		String str;
		StringBuilder sb =new StringBuilder();
		while( !(str = br.readLine()).equals("#")) {
			int result = 0;
			for (int i = 0; i < str.length(); i++) {
				String a = str.substring(i,i+1);
				for (int j = 0; j < moeum.length; j++) {
					if(a.equals(moeum[j])) {
						result++;
						break;
					}
				}
			}
			sb.append(result+"\n");
		}
		System.out.println(sb.toString());
	}

}
