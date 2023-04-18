package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj2810 {
	static int N,result;
	static boolean[] visited;
	static char[] arr;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		visited=new boolean[N+1];
		arr= br.readLine().toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]=='L') {
				visited[i+1]=true;
				i++;
			}
		}//end of reading
		
		for (int i = 0; i < arr.length; i++) {
			if(!visited[i]) {
				visited[i]=true;
				result++;
			}else if(!visited[i+1]) {
				visited[i+1]=true;
				result++;
			}
		}
		System.out.println(result);
	}

}
