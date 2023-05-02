package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Bj15904 {
	private static final String answer = "I love UCPC";
	private static final String fail = "I hate UCPC";
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String[] arr=br.readLine().split(" ");
		
		Map<String, Integer> map =new HashMap<String, Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			String tmp = arr[i].substring(0,1);
			map.put(tmp, 1);
		}
		
	}

}
