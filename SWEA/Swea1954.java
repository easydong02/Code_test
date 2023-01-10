package hwalgo02_신동희_15반_신동희;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution_d2_1954_loop {
	static int T;
	static int N;
	static int[][] snail;
	
	static int[] dr= {0,1,0,-1};
	static int[] dc= {1,0,-1,0};
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		T= Integer.parseInt(br.readLine());
		
		for (int tc = 1; tc <= T; tc++) {
			N= Integer.parseInt(br.readLine());
			snail = new int[N][N];
			snail[0][0]= 1;
			int r=0;
			int c=0;
			int cnt=0;
			for (int i = 2; i <= N*N; i++) {
				r = r+dr[cnt];
				c = c+dc[cnt];
				
				if(r>=0 && r<N && c>=0 && c<N && (snail[r][c]==0)) {
					snail[r][c]  = i;
				}else {
					r = r-dr[cnt]+dr[(cnt+1)%4];
					c = c-dc[cnt]+dc[(cnt+1)%4];
					snail[r][c] =i;
					cnt = (cnt+1)%4;
				}
			}
			System.out.println("#"+tc);
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					System.out.print(snail[i][j]+" ");
				}
				System.out.println();
			}
			
		}

	}

}
