package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bj1159 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Map<String, Integer> map = new HashMap<String, Integer>();
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		List<String> arr =new ArrayList<>();
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N; i++) {
			String str= br.readLine().substring(0,1);
			int num = map.getOrDefault(str, 0) +1;
			map.put(str, num);
		}
		
		for(String key: map.keySet()) {
			if(map.get(key)>=5) {
				arr.add(key);
			}
		}
		
		if(arr.size()>=1) {
			Collections.sort(arr);
			String[] result =  arr.toArray(new String[arr.size()]);
			String answer = String.join("", result);
			System.out.println(answer);
		}else {
			System.out.println("PREDAJA");
		}
		
	}

}
