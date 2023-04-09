package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj5988 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N; i++) {
			String str= br.readLine();
			String num = str.substring(str.length()-1,str.length());
			int chk = Integer.parseInt(num);
			if(chk%2==0) {
				System.out.println("even");
			}else {
				System.out.println("odd");
			}
			
		}
	}

}
