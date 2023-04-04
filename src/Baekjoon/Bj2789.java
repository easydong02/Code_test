package Baekjoon;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bj2789 {
	
	private static final String[] ARR = {"C","A","M","B","R","I","D","G","E"};
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str = sc.nextLine();
		StringBuilder result = new StringBuilder();
		
		Map<String, Integer> map = new HashMap<>();
		for(String a : ARR) {
			map.put(a, 1);
		}
		
		for (int i = 0; i < str.length(); i++) {
			String tmp = str.substring(i,i+1);
			if(map.containsKey(tmp)) {
				continue;
			}
			result.append(tmp);
		}
		System.out.println(result.toString());
	}

}
