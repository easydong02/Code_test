package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;

public class Bj1181 {
	
	static int N;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		N= Integer.parseInt(br.readLine());
		Set<String> strSet = new HashSet<>();
		for (int i = 0; i < N; i++) {
			strSet.add(br.readLine());
		}
		
		Iterator<String> iter= strSet.iterator();
		
		List<String> arr= new ArrayList<String>();
		
		while(iter.hasNext()) {
			arr.add(iter.next());
		}
		
		Collections.sort(arr, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if(o1.length() <o2.length()) return -1;
				else if(o1.length()== o2.length()) {
					return o1.compareTo(o2);
				}else return 1;
			}
		});
		
		StringBuilder sb =new StringBuilder();
		for (int i = 0; i < arr.size(); i++) {
			sb.append(arr.get(i)+"\n");
		}
		
		System.out.println(sb.toString());
	}

}
