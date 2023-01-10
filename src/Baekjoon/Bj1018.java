package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj1018 {
	
	static int N,M,result=Integer.MAX_VALUE;
	static char[][] board, chk1,chk2;
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st= new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		board= new char[N][M];
		chk1 = new char[8][8];
		chk2 = new char[8][8];
		
		for (int i = 0; i < N; i++) {
			char[] temp = br.readLine().toCharArray();
			for (int j = 0; j < M; j++) {
				board[i][j]= temp[j];
			}
		}// end of reading
		
		//비교대상 배열 만들기
		chk1[0][0]='B';
		chk2[0][0]='W';
		for (int i = 0; i < 8; i++) {
			if(i!=0) {
				chk1[i][0] = chk1[i-1][0]=='B'? 'W':'B';
				chk2[i][0] = chk2[i-1][0]=='B'? 'W':'B';
			}
			for (int j = 1; j < 8; j++) {
				chk1[i][j]= chk1[i][j-1] =='B' ? 'W':'B';
				chk2[i][j]= chk2[i][j-1] =='B' ? 'W':'B';
			}
		}
		
		
		for (int i = 0; i <= N-8; i++) {
			for (int j = 0; j <= M-8; j++) {
				int temp = go(i,j);
				result = Math.min(result, temp);
			}
		}
		
		System.out.println(result);
	}
	
	//칠해야 되는 개수 세는 메서드
	private static int go(int n, int m) {
		int sum1=0;
		int sum2=0;
		for (int i = n; i < n+8; i++) {
			for (int j = m; j < m+8; j++) {
				if(board[i][j] != chk1[i-n][j-m])sum1++;
				if(board[i][j] != chk2[i-n][j-m])sum2++;
			}
		}
		
		return Math.min(sum1, sum2);
	}

}
