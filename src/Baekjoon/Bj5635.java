package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bj5635 {
	static int N;
	static String[][] map;
	static Map<String, String> rmap;
	static List<String> arr;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		map= new String[N][];
		rmap=new HashMap<String, String>();
		arr= new ArrayList<String>();
		
		for (int i = 0; i < N; i++) {
			map[i] = br.readLine().split(" ");
		}//end of reading
		
		for (int i = 0; i < N; i++) {
			StringBuilder sb= new StringBuilder();
			sb.append(map[i][3]);
			if(map[i][2].length() !=2) {
				sb.append("0");
			}
			sb.append(map[i][2]);
			if(map[i][1].length() !=2) {
				sb.append("0");
			}
			sb.append(map[i][1]);
			
			rmap.put(sb.toString(), map[i][0]);
			arr.add(sb.toString());
		}
		
		Collections.sort(arr);
		
		System.out.println(rmap.get(arr.get(arr.size()-1)));
		System.out.println(rmap.get(arr.get(0)));
		
	}

}
