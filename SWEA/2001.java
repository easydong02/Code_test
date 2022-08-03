package hwalgo03_서울_15반_신동희;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_2001 {
	
	static int[][] map;
	static int T;
	
	static int N;
	static int M;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		T= Integer.parseInt(br.readLine());
		
		for (int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			
			map = new int[N][N];
			
			for (int i = 0; i < N; i++) {
				st= new StringTokenizer(br.readLine());
				for (int j = 0; j < N; j++) {
					map[i][j]= Integer.parseInt(st.nextToken());
					
				}
			}// end of reading
			 
			int max = Integer.MIN_VALUE;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					map[i][j]= fly(i,j);
				}
			}
			
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if(map[i][j]>=max) {
						max=map[i][j];
					}
				}
			}

			
			System.out.println("#"+tc+" "+max);
			
		}

	}



	private static int fly(int i, int j) {
		int sum=0;
		for (int k = i; k < i+M; k++) {
			for (int k2 = j; k2 < j+M; k2++) {
				if(k>=0 && k<N && k2>=0 && k2<N ) {
					sum += map[k][k2];
				}
			}
		}
		return sum;
	}

}
