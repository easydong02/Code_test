package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj1436 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		long num = 1;
		while(n >0) {
			num++;
			int chk = go(num);
			if(chk==-1) {
				n--;
			}else if(chk != -100) {
				num - chk
			}
		}
		System.out.println(num);
	}

	private static int go(long num) {
		String a = String.valueOf(num);
		for (int i = 0; i < a.length()-2 ; i++) {
			if(a.substring(i,i+3).equals("666")) {
				if(i == a.length()-3) {
					return -1;
				}else {
					String tmp = a.substring(i+3);
					return Integer.parseInt(tmp);
				}
			}
		}
		return -100;
	}

}
