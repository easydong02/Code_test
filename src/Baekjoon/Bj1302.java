package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Bj1302 {
	static Map<String, Integer> map;
	public static void main(String[] args) throws NumberFormatException, IOException {
		map =new HashMap<String, Integer>();
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int result =Integer.MIN_VALUE;
		String resultKey="";
		for (int i = 0; i < N; i++) {
			String str= br.readLine();
			if(map.get(str)!=null) {
				map.replace(str, map.get(str)+1);
			}else {
				map.put(str, 1);
			}
		}
		
		for( String key : map.keySet()) {
			if(map.get(key)>result) {
				result = map.get(key);
				resultKey=key;
			}else if(map.get(key)==result) {
				resultKey = key.compareTo(resultKey) < 0? key:resultKey;
			}
		}
		
		System.out.println(resultKey);
	}

}
