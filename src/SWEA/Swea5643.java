package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Swea5643 {
	
	static int T,N,M,result;
	static int[][] map;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());
		
		
		for (int testcase = 1; testcase <= T; testcase++) {
			result=0;
			N = Integer.parseInt(br.readLine());
			map=new int[N][N];
			M=  Integer.parseInt(br.readLine());
			for (int i = 0; i < M; i++) {
				StringTokenizer st= new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken())-1;
				int b = Integer.parseInt(st.nextToken())-1;
				map[a][b]= 1;
			} //end of reading
			
			
			for (int i = 0; i < N; i++) {
				bfs(i);
			}
			
			
			for (int i = 0; i < N; i++) {
				if(check(i))result++;
			}
			
			System.out.println("#"+testcase+" "+result);
		}
	}
	private static boolean check(int num) {
		boolean[] numChk = new boolean[N];
		numChk[num]=true;
		for (int i = 0; i < N; i++) {
			if(map[num][i]==1)numChk[i]=true;
		}
		for (int i = 0; i < N; i++) {
			if(map[i][num]==1)numChk[i]=true;
		}
		
		for (int i = 0; i < numChk.length; i++) {
			if(!numChk[i])return false;
		}
		
		return true;
	}
	private static void bfs(int i) {
		boolean[][] visited= new boolean[N][N];
		Queue<Integer> que = new LinkedList<Integer>();
		que.offer(i);
		
		while(!que.isEmpty()) {
			int cur = que.poll();
			
			for (int j = 0; j < N; j++) {
				if(map[cur][j]==1 && !visited[i][j]) {
					que.offer(j);
					visited[i][j] = true;
					map[i][j]=1;
				}
			}
		}
	}

}
