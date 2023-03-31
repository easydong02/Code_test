package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj1652 {

	static int[][] map;
	static int resultR,resultC;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		map = new int[N][N];
		for (int i = 0; i < N; i++) {
			char[] tmp = br.readLine().toCharArray();
			for (int j = 0; j < N; j++) {
				if(tmp[j] =='.') {
					map[i][j]=1;
				}else {
					map[i][j]=0;
				}
			}
		}//end of reading
		
		
		//가로
		for (int i = 0; i < N; i++) {
			int tmp = 0;
			for (int j = 0; j < N; j++) {
				if(map[i][j]==1) {
					tmp ++;
				}else {
					if(tmp>=2) {
						resultR++;
					}
					tmp=0;
				}
			}
			if(tmp>=2)resultR++;
		}
		
		//세로
		for (int i = 0; i < N; i++) {
			int tmp = 0;
			for (int j = 0; j < N; j++) {
				if(map[j][i]==1) {
					tmp ++;
				}else {
					if(tmp>=2) {
						resultC++;
					}
					tmp=0;
				}
			}
			if(tmp>=2)resultC++;
		}
		System.out.println(resultR +" "+resultC);
		
	}

}
