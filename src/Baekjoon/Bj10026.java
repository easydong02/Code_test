package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Bj10026 {
	static class Rgb{
		int r;
		int c;
		char color;
		
		public Rgb(int r, int c, char color) {
			super();
			this.r = r;
			this.c = c;
			this.color = color;
			
		}
	}
	
	
	static int N,normal,abnormal;
	static char[][] map;
	static boolean[][] visited;
	
	static boolean[][] visited2;
	
	static int[] dr= {-1,0,1,0};
	static int[] dc= {0,1,0,-1};
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		N=Integer.parseInt(br.readLine());
		map=new char[N][N];
		visited=new boolean[N][N];
		visited2=new boolean[N][N];
		for (int i = 0; i < N; i++) {
			char[] tmp= br.readLine().toCharArray();
			for (int j = 0; j < N; j++) {
				map[i][j]=tmp[j];
			}
		}//end of reading
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if(!visited[i][j])normal(i,j);
			}
		}
//		for(char[]m : map) {
//			System.out.println(Arrays.toString(m));
//		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if(map[i][j]=='G')map[i][j]='R';
			}
		}
//		System.out.println("---------------------");
//		for(char[]m : map) {
//			System.out.println(Arrays.toString(m));
//		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if(!visited2[i][j])abnormal(i,j);
			}
		}
		
		
		
		System.out.println(normal+" "+abnormal);
		
	}
	private static void abnormal(int r, int c) {
		Queue<Rgb> que = new LinkedList<>();
		visited2[r][c]=true;
		que.offer(new Rgb (r,c,map[r][c]));
		
		while(!que.isEmpty()) {
			Rgb cur= que.poll();
			int rr= cur.r;
			int cc= cur.c;
			char color= cur.color;
			
			for (int i = 0; i < dc.length; i++) {
				int nr= rr+dr[i];
				int nc= cc+dc[i];
				if(nr>=0 && nr<N && nc>=0 && nc<N && color==map[nr][nc] && !visited2[nr][nc]) {
					visited2[nr][nc]=true;
					que.offer(new Rgb(nr,nc,color));
				}
			}
		}
		abnormal++;
		
		
	}
	private static void normal(int r, int c) {
		Queue<Rgb> que = new LinkedList<>();
		visited[r][c]=true;
		que.offer(new Rgb (r,c,map[r][c]));
		
		while(!que.isEmpty()) {
			Rgb cur= que.poll();
			int rr= cur.r;
			int cc= cur.c;
			char color= cur.color;
			
			for (int i = 0; i < dc.length; i++) {
				int nr= rr+dr[i];
				int nc= cc+dc[i];
				if(nr>=0 && nr<N && nc>=0 && nc<N && color==map[nr][nc] && !visited[nr][nc]) {
					visited[nr][nc]=true;
					que.offer(new Rgb(nr,nc,color));
				}
			}
		}
		normal++;
		
		
	}

}
