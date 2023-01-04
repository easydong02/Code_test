package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Bj9012 {
	
	static int T;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < T; i++) {
			sb.append(isVPS(br.readLine()));
			sb.append("\n");
		}
		
		System.out.println(sb.toString());
	}
	private static String isVPS(String str) {
		Queue<Character> que= new LinkedList<Character>();
		char[] temp = str.toCharArray();
		if(temp[0]==')')return "NO";
		for (int i = 0; i < temp.length; i++) {
			char tmp= temp[i];
			
			if(tmp=='(') {
				que.offer(tmp);
			}else {
				if(que.isEmpty())return "NO";
				
				if(que.poll()==')')return "NO";
			}
		}
		if(que.isEmpty())return "YES";
		
		return "NO";
	}

}
