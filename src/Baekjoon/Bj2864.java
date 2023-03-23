package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj2864 {

	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st= new StringTokenizer(br.readLine());
		StringBuilder num1= new StringBuilder();
		StringBuilder num2= new StringBuilder();
		
		char[] str1= st.nextToken().toCharArray();
		char[] str2= st.nextToken().toCharArray();
		
		for (int i = 0; i < str1.length; i++) {
			if(str1[i] =='5' || str1[i] =='6') {
				num1.append('5');
				num2.append('6');
				continue;
			}
			num1.append(str1[i]);
			num2.append(str1[i]);
		}
		num1.append(" ");
		num2.append(" ");
		for (int i = 0; i < str2.length; i++) {
			if(str2[i] =='5' || str2[i] =='6') {
				num1.append('5');
				num2.append('6');
				continue;
			}
			num1.append(str2[i]);
			num2.append(str2[i]);
		}
		
		StringTokenizer result1= new StringTokenizer(num1.toString());
		StringTokenizer result2= new StringTokenizer(num2.toString());
		
		int ret1 = Integer.parseInt(result1.nextToken()) + Integer.parseInt(result1.nextToken());
		int ret2 = Integer.parseInt(result2.nextToken()) + Integer.parseInt(result2.nextToken());
		
		System.out.println(ret1+" "+ret2);
		
	}

}
