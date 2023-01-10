package Baekjoon;

import java.awt.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Bj2468 {
	static int N,result;
	static int[][] map;
	static boolean[][] visited;
	
	static int[] dr= {-1,0,1,0};
	static int[] dc= {0,1,0,-1};
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		N= Integer.parseInt(br.readLine());
		map= new int[N][N];
		result=1;
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st= new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				map[i][j]=Integer.parseInt(st.nextToken());
			}
		}//end of reading
		
		for (int i = 1; i <= 100; i++) {
			visited=new boolean[N][N];
			int sum =0;
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < N; k++) {
					if(!visited[j][k] && map[j][k]>i) {
						sum++;
						visited[j][k]=true;
						dfs(j,k,i);
					}
				}
			}
			result = Math.max(result, sum);
		}
		
		System.out.println(result);
		
	}
	private static void dfs(int j, int k, int rain) {
		visited[j][k]=true;
		
		
		for (int i = 0; i < dc.length; i++) {
			int nr = j+ dr[i];
			int nc = k+ dc[i];
			if(nr>=0 && nr <N && nc>=0 && nc<N && !visited[nr][nc]) {
				if(map[nr][nc]>rain) {
					dfs(nr,nc,rain);
				}
			}
		}
		
		
	}

}
