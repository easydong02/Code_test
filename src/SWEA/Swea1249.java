package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Swea1249 {
	
	static public class Machine implements Comparable<Machine> {
		int r;
		int c;
		int dist;
		
		public Machine(int r, int c, int dist) {
			super();
			this.r = r;
			this.c = c;
			this.dist = dist;
		}

		@Override
		public int compareTo(Machine o) {
			return this.dist - o.dist;
		}
		
	}
	
	
	
	static int T,N,map[][],results[][],min;
	static int[] dr  = {-1,0,1,0};
	static int[] dc = {0,1,0,-1};
	static PriorityQueue<Machine> que;
	static boolean[][] visited;
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());
		
		for (int testcase = 1; testcase <=T; testcase++) {
			N = Integer.parseInt(br.readLine());
			map = new int[N][N];
			results = new int[N][N];
			visited= new boolean[N][N];
			results[0][0]= 0;
			que= new PriorityQueue<>();
			min = Integer.MAX_VALUE;
			for (int i = 0; i <N; i++) {
				char[] tmp = br.readLine().toCharArray();
				for (int j = 0; j < N; j++) {
					map[i][j]= tmp[j] - '0';
				}
			}// end of reading
			
			for (int i = 0; i < results.length; i++) {
				Arrays.fill(results[i], Integer.MAX_VALUE);
			}
			
			bfs(0,0);
			System.out.println("#"+testcase+" "+min);
		}
	}
	private static void bfs(int i, int j) {
		que.offer(new Machine(i, j, 0));
		
		visited[i][j]=true;
		
		while(!que.isEmpty()) {
			Machine m = que.poll();
			int r = m.r;
			int c = m.c;
			int dist= m.dist;
			
			
			if(r== N-1 && c == N-1) {
				min = dist<min? dist:min;
			}
			
			if(dist>=min)continue;
			
			for (int k = 0; k < dc.length; k++) {
				int nr = r + dr[k];
				int nc = c+  dc[k];
				if(nr >=0 && nr < N && nc >=0 && nc <N) {
					int dist2 = dist + map [nr][nc];
					if( !visited[nr][nc] || dist2 < results[nr][nc]) {
						visited[nr][nc] = true;
						results[nr][nc]=dist2;
						que.offer(new Machine(nr, nc, dist2));
					}
				}
			}
			
			
		}
	}
	
}
