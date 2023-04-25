package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Bj4358 {
	static Map<String, Integer> map;
	static ArrayList<String> names;
	static int num;
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String name;
		map= new HashMap<String, Integer>();
		names = new ArrayList<>();
		while(true) {
			name = br.readLine();
			if(name==null || name.length()==0)break;
			
			if(map.getOrDefault(name, -1)!=-1) {
				map.replace(name,map.get(name)+1);
			}else {
				map.put(name, 1);
				names.add(name);
			}
			num++;
		}
		
		
		StringBuilder result = new StringBuilder();
		Collections.sort(names);
		for (int i = 0; i < names.size(); i++) {
			String key= names.get(i);
			String r = String.format("%.4f", (double)map.get(key)/num*100);
			result.append(key+" "+r+"\n");
		}
		System.out.println(result.toString());
	}

}
