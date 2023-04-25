package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Bj4358 {
	static Map<String, Integer> map;
	static int num;
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String name;
		map= new HashMap<String, Integer>();
		while((name = br.readLine()) !=null) {
			if(map.getOrDefault(name, -1)!=-1) {
				map.replace(name,map.get(name));
			}else {
				map.put(name, 1);
			}
			num++;
		}
		
		
		StringBuilder result = new StringBuilder();
		
	}

}
