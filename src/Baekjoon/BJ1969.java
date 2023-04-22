package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BJ1969 {
	
	static int resultNum;
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st= new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		String[] arr =new String[n];
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < n; i++) {
			String str= br.readLine();
			arr[i]=str;
		}//end of reading
		
		for (int i = 0; i < m; i++) {
			Map<Character, Integer>map = new HashMap();
			for (int j = 0; j < n; j++) {
				char tmp = arr[j].charAt(i);
				if(map.getOrDefault(tmp, 0) == 0) {
					map.put(tmp, 1);
				}else {
					map.replace(tmp, map.get(tmp)+1);
				}
			}
			int max = Integer.MIN_VALUE;
			ArrayList<Character> charArr= new ArrayList<>();
			for(char key : map.keySet()) {
				int cnt = map.get(key);
				if(cnt>max) {
					charArr=new ArrayList<>();
					charArr.add(key);
					max= cnt;
				}else if(cnt == max) {
					charArr.add(key);
				}
			}
			Collections.sort(charArr);
			result.append(charArr.get(0));
			resultNum += (n-map.get(charArr.get(0)));
		}
		
		System.out.println(result.toString()+"\n"+resultNum);
		
		
	}


}
