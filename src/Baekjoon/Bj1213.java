package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Bj1213 {
	static String FAIL = "I'm Sorry Hansoo";
	
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		String str= br.readLine();
		
		//검증
		Map<String, Integer> valiMap = new HashMap<String, Integer>();
		
		for (int i = 0; i < str.length(); i++) {
			String tmp = str.substring(i,i+1);
			if(valiMap.containsKey(tmp)) {
				valiMap.remove(tmp);
			}else {
				valiMap.put(tmp, 1);
			}
		}
		int vali = valiMap.keySet().size();
		if(!(vali == 0 || vali ==1)) {
			System.out.println(FAIL);
			System.exit(0);
		}
		
		
		//만들기 시작
		StringBuilder result = new StringBuilder();
		String part="";
		if(vali==1) {
			Iterator<String> it =  valiMap.keySet().iterator();
			part = it.next();
		}
		
		List<String> arr =  new ArrayList<>();
		boolean chk = true;
		for (int i = 0; i < str.length(); i++) {
			if(chk && str.substring(i,i+1).equals(part)) {
				chk=false;
				continue;
			}
			arr.add(str.substring(i,i+1));
		}
		
		Collections.sort(arr);
		
		for (int i = 0; i < arr.size(); i+=2) {
			result.append(arr.get(i));
		}
		result.append(part);
		
		for (int i = arr.size()-1; i >=0; i-=2) {
			result.append(arr.get(i));
		}
		System.out.println(result.toString());
	}

}
