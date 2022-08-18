package hwalgo14_서울_15반_신동희;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main_1987 {
	static int R,C;
	static int[][] map;
	static boolean[] visited = new boolean[26];
	static int max=Integer.MIN_VALUE;
	
	static int[] dr= {-1,0,1,0};
	static int[] dc= {0,1,0,-1};
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine());
		
		R=Integer.parseInt(st.nextToken());
		C=Integer.parseInt(st.nextToken());
		map=new int[R][C];
		//visited= new boolean[R][C];
		
		for (int i = 0; i < R; i++) {
			String temp= br.readLine();
			for (int j = 0; j < C; j++) {
				map[i][j]= temp.charAt(j)-'A';
			}
		}//end of reading
		
		
		dfs(0,0,0);
		System.out.println(max);
	}
	private static void dfs(int r, int c, int cnt) {
		if(visited[map[r][c]]) {
			max= Math.max(max, cnt);
			return;
		}else {
			visited[map[r][c]]=true;
			for (int i = 0; i < dc.length; i++) {
				int nr= r+dr[i];
				int nc= c+dc[i];
				if(nr>=0 && nr<R && nc>=0 && nc <C ) {
					dfs(nr,nc,cnt+1);
				}
			}
			visited[map[r][c]]=false;
		}
		
	}

}
