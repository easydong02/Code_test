package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Bj14425 {
	static int N,M,result;
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st =new StringTokenizer(br.readLine());
		N =Integer.parseInt(st.nextToken());
		M= Integer.parseInt(st.nextToken());
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		while(N-->0) {
			map.put(br.readLine(), 0);
		}
		
		while(M-->0) {
			if(map.containsKey(br.readLine())) {
				result++;
			}
		}
		
		System.out.println(result);
	}

}
