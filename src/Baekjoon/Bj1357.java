package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj1357 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine());
		String str1= st.nextToken();
		String str2= st.nextToken();
		
		StringBuilder num1 =new StringBuilder();
		StringBuilder num2 =new StringBuilder();
		
		for (int i = str1.length()-1; i >=0; i--) {
			num1.append(str1.substring(i,i+1));
		}
		for (int i = str2.length()-1; i >=0; i--) {
			num2.append(str2.substring(i,i+1));
		}
		
		String result =String.valueOf(Integer.parseInt(num1.toString()) + Integer.parseInt(num2.toString()));
		StringBuilder num3= new StringBuilder();
		for (int i = result.length()-1; i >=0; i--) {
			num3.append(result.substring(i,i+1));
		}
		
		System.out.println(Integer.parseInt(num3.toString()));
		
	}

}
