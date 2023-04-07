package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj1225 {
	
	static long result;
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine());
		
		String str1= st.nextToken();
		String str2= st.nextToken();
		
		for (int i = 0; i < str1.length(); i++) {
			int tmp = Integer.parseInt(str1.substring(i,i+1));
			for (int j = 0; j < str2.length(); j++) {
				int tmp2= Integer.parseInt(str2.substring(j,j+1));
				result += tmp*tmp2;
			}
		}
		System.out.println(result);
	}

}
