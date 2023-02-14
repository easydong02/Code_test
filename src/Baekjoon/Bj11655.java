package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj11655 {
	static String str;
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		char[] arr=  br.readLine().toCharArray();
		
		StringBuilder sb= new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			int tmp = (int)arr[i];
			if((tmp>=48 && tmp<=57) || (tmp == 32)) { //공백이나 숫자
				sb.append(arr[i]);
				continue;
			}
			if(tmp<=90) {//대문자
				if(tmp>77)tmp = tmp+13-90+64;
				else tmp+=13;
			}else {//소문자
				if(tmp>109)tmp = tmp+13-122+96;
				else tmp +=13;
			}
			
			sb.append((char)tmp);
		}
		
		System.out.println(sb.toString());
	}

}
