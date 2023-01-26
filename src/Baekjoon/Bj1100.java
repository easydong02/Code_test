package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Bj1100 {
	
	static char[][] map= new char[8][8];
	static int result;
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < 8; i++) {
			map[i]= br.readLine().toCharArray();
		}
		
		boolean chk = true;
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if(chk && map[i][j]=='F') {
					result ++;
				}
				chk= !chk;
			}
			chk = !chk;
		}
		
		System.out.println(result);
		
	}

}
