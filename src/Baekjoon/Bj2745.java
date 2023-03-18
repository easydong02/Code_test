package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj2745 {

	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st= new StringTokenizer(br.readLine());
		
		String str = st.nextToken();
		int zin = Integer.parseInt(st.nextToken());
		int result = 0;
		
		for (int i = str.length()-1; i >=0; i--) {
			char tmp = str.charAt(i);
			int num =0;
			if(tmp>=65) {
				num = (int)tmp - 55;
			}else {
				num = (int)tmp - 48;
			}
			result += num * Math.pow(zin, str.length()-i-1);
		}
		
		System.out.println(result);
	}

}
