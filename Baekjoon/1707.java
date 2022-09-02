package algo0831;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_1707_이분그래프 {
	static int K,V,E;
	static List<Integer>[] adjList;
	static int[] visited;
	static boolean chk;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		K= Integer.parseInt(br.readLine());
		
		for (int i = 0; i < K; i++) {
			chk=true;
			StringTokenizer st= new StringTokenizer(br.readLine());
			V=Integer.parseInt(st.nextToken());
			E=Integer.parseInt(st.nextToken());
			adjList=new ArrayList[V];
			visited=new int[V];
			Arrays.fill(visited, -1);
			for (int j = 0; j < V; j++) {
				adjList[j]= new ArrayList<>();
			}
			
			for (int j = 0; j < E; j++) {
				st =new StringTokenizer(br.readLine());
				int from = Integer.parseInt(st.nextToken())-1;
				int to = Integer.parseInt(st.nextToken())-1;
				
				adjList[from].add(to);
				adjList[to].add(from);
			}
			
			for (int j = 0; j < V; j++) {
				bfs(j);
			}
			
			for (int j = 0; j < adjList.length; j++) {
				int tmp= visited[j];
				for (int k = 0; k < adjList[j].size(); k++) {
					if(tmp==0) {
						if(visited[adjList[j].get(k)]==0) {
							chk=false;
							break;
						}
					}else if(tmp==1) {
						if(visited[adjList[j].get(k)]==1) {
							chk=false;
							break;
						}
					}
				}
			}
			
			if(chk) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}
	private static void bfs(int idx) {
		Queue<Integer> que= new LinkedList<>();
		if(visited[idx] !=-1) {
			return;
		}
		visited[idx]=1;
		for (int i = 0; i < adjList[idx].size(); i++) {
			que.offer(adjList[idx].get(i));
			visited[adjList[idx].get(i)]=0;
		}
		while(!que.isEmpty()) {
			int cur = que.poll();
			
			for (int i = 0; i < adjList[cur].size(); i++) {
				int tmp= adjList[cur].get(i);
				if(visited[tmp] == -1) {
					que.offer(tmp);
					if(visited[cur] ==0) {
						visited[tmp]=1;
					}else {
						visited[tmp]=0;
					}
				}
			}
		}
	}

}
