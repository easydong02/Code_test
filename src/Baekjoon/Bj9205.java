package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Bj9205 {
	
	static int t,n,map[][];
	static int inf =1000000000;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		t = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < t; i++) {
			List<int[]> list= new ArrayList<>();
			n = Integer.parseInt(br.readLine());
			map= new int[n+2][n+2];
			
			for (int j = 0; j < n+2; j++) {
				for (int j2 = 0; j2 < n+2; j2++) {
					map[j][j2]= inf;
				}
			}
			
			for (int j = 0; j < n+2; j++) {
					StringTokenizer st= new StringTokenizer(br.readLine());
					int r = Integer.parseInt(st.nextToken());
					int c = Integer.parseInt(st.nextToken());
					list.add(new int [] {r,c});
			}
			
			for (int j = 0; j < n+2; j++) {
				for (int j2 = 0; j2 < n+2; j2++) {
					if(j == j2) {
						map[j][j2]=0;
					}else {
						int[] cur = list.get(j);
						int[] next = list.get(j2);
						if(Math.abs(cur[0]-next[0]) + Math.abs(cur[1]-next[1])<=1000) {
							map[j][j2]=1;
						}
					}
				}
			}
			
			for (int k = 0; k < n+2; k++) {
				for (int j = 0; j < n+2; j++) {
					for (int h = 0; h < n+2; h++) {
						if(map[j][h] > map[j][k]+map[k][h]) {
							map[j][h]=map[j][k]+map[k][h];
						}
					}
				}
			}
			String result = map[0][n+1] != inf ? "happy":"sad";
			System.out.println(result);
		}
		
	}

}
