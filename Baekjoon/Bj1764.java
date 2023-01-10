package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Bj1764 {

	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st= new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		Map<String, Boolean> map = new HashMap<String, Boolean>();
		
		for (int i = 0; i < n; i++) {
			map.put(br.readLine(), true);
		}
		
		List<String> list= new ArrayList<String>();
		StringBuilder sb= new StringBuilder();
		
		for (int i = 0; i < m; i++) {
			String temp = br.readLine();
			if(map.get(temp)==null)continue;
			if(map.get(temp)) {
				list.add(temp);
			}
		}
		
		Collections.sort(list);
		
		System.out.println(list.size());
		for (int i = 0; i < list.size(); i++) {
			sb.append(list.get(i)+"\n");
		}
		
		System.out.println(sb.toString());
	}

}
