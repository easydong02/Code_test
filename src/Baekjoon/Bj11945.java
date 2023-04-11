package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj11945 {
	private static int[][] map;
	private static int R,C;
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st= new StringTokenizer(br.readLine());
		
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		
		map= new int[R][C];
		
		for (int i = 0; i < R; i++) {
			char[] tmp = br.readLine().toCharArray();
			for (int j = 0; j < C; j++) {
				map[i][C-j-1]= tmp[j]-'0';
			}
		}//end of reading
		
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				result.append(map[i][j]);
			}
			result.append("\n");
		}
		System.out.println(result.toString());
	}

}
