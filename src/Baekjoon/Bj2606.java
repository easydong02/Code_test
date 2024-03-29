package Baekjoon;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Bj2606 {
	
	static int N,M,result;
	static List<Integer>[] list;
	static boolean[] visited;
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		N=sc.nextInt();
		M=sc.nextInt();
		visited=new boolean[N];
		list= new ArrayList[N];
		for (int i = 0; i < N; i++) {
			list[i]= new ArrayList<>();
		}
		
		for (int i = 0; i < M; i++) {
			int s= sc.nextInt()-1;
			int e= sc.nextInt()-1;
			list[s].add(e);
			list[e].add(s);
		}
		
		bfs(0);
		System.out.println(result);
		
	}
	private static void bfs(int start) {
		visited[start]=true;
		Queue<Integer> que =new LinkedList<Integer>();
		que.offer(start);
		
		while(!que.isEmpty()) {
			int tmp= que.poll();
			if(list[tmp].size()!=0) {
				for (int i = 0; i < list[tmp].size(); i++) {
					int end =list[tmp].get(i);
					if(!visited[end]) {
						visited[end]=true;
						que.offer(end);
						result++;
					}
				}
			}

			
		}
	}

}
