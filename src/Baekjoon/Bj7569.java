package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Bj7569 {
	static int H,N,M,result;
	static int[][][] map;
	static boolean[][][] visited;
	static List<int[]> points;
	
	static int[] dr= {-1,0,1,0};
	static int[] dc= {0,1,0,-1};
	static int[] dh= {-1,1};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st= new StringTokenizer(br.readLine());
		
		M= Integer.parseInt(st.nextToken());
		N= Integer.parseInt(st.nextToken());
		H= Integer.parseInt(st.nextToken());
		result = M*N*H;
		map=new int[H][N][M];
		visited=new boolean[H][N][M];
		points= new ArrayList<int[]>();
		
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < N; j++) {
				st= new StringTokenizer(br.readLine());
				for (int k = 0; k < M; k++) {
					int tmp= Integer.parseInt(st.nextToken());
					map[i][j][k] = tmp;
					if(tmp==1) {
						points.add(new int[] {i,j,k});
					}else if(tmp==-1) {
						result--;
					}
				}
			}
		}//end of reading
		
		bfs();
		
		
//		for (int i = 0; i < H; i++) {
//			for(int[] m : map[i]) {
//				System.out.println(Arrays.toString(m));
//			}
//		}
		
		
	}

	private static void bfs() {
		int sum=0;
		Queue<int[]> que = new LinkedList<int[]>();
		for (int i = 0; i < points.size(); i++) {
			int[] tmp = points.get(i);
			visited[tmp[0]][tmp[1]][tmp[2]]=true;
			que.offer(new int[] {tmp[0],tmp[1],tmp[2],0});
			sum++;
		}
		
		int dist =0;
		while(!que.isEmpty()) {
			int[] tmp = que.poll();
			int hh= tmp[0];
			int rr= tmp[1];
			int cc= tmp[2];
			dist=tmp[3];
			
			for (int i = 0; i < dr.length; i++) {
				int nr= rr+dr[i];
				int nc= cc+dc[i];
				if(nr>=0 && nr <N && nc >=0 && nc<M && !visited[hh][nr][nc]) {
					if(map[hh][nr][nc] != -1) {
						map[hh][nr][nc]=1;
						que.offer(new int[] {hh,nr,nc,dist+1});
						sum++;
					}
					visited[hh][nr][nc]=true;
				}
			}
			for (int i = 0; i < dh.length; i++) {
				int nh= hh+dh[i];
				if(nh>=0 && nh < H && !visited[nh][rr][cc]) {
					if(map[nh][rr][cc] != -1) {
						map[nh][rr][cc]=1;
						que.offer(new int[] {nh,rr,cc,dist+1});
						sum++;
					}
					visited[nh][rr][cc]=true;
				}
			}
			
		}
		if(sum==result) {
			System.out.println(dist);
		}else {
			System.out.println(-1);
		}
	}

}
