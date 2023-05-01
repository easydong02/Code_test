package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj1769 {

	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		String in = br.readLine();
		int cnt = 0;
		while(in.length()>1) {
			int sum = 0;
			cnt ++;
			for (int i = 0; i < in.length(); i++) {
				sum += Integer.parseInt(in.substring(i,i+1));
			}
			in = String.valueOf(sum);
			if(sum<10) {
				break;
			}
		}
		int result = Integer.parseInt(in);
		System.out.println(cnt);
		if(result%3==0) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}

}
