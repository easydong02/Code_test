package hwalgo28_서울_15반_신동희;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;

public class BOJ_15961_G4_회전초밥2 {
	
	static int N,d,k,c,result;
	static int[] sushi;
	static HashSet<Integer> set;
	static HashMap<Integer,Integer> map;
	static int start, end;
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		d = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		
		sushi = new int[N];
		set= new HashSet<>();
		map= new HashMap<>(); //get없으면 null
		result = Integer.MIN_VALUE;
		for (int i = 0; i < N; i++) {
			sushi[i]= Integer.parseInt(br.readLine());
		}//end of reading
		
		//dict 초기화
		for (int i = 1; i <= d; i++) {
			map.put(i, 0);
		}
		
		start= 0;
		end = k;
		
		for (int i = start; i < end ; i++) {
			//set에 추가하고 중복은 map에서 처리
			set.add(sushi[i]);
			map.replace(sushi[i], map.get(sushi[i])+1);
		}
		
		result = set.contains(c)? Math.max(result,set.size()) : Math.max(result, set.size()+1); 
		
		//그 뒤부터 갱신
		for (int i = end; i < N +k-1; i++) {
			int idx = i%N;
			set.add(sushi[idx]);
			map.replace(sushi[idx], map.get(sushi[idx])+1);
			if(map.get(sushi[start])>0) {
				map.replace(sushi[start], map.get(sushi[start])-1);
				if(map.get(sushi[start])==0)set.remove(sushi[start]);
			}
			
			start++;
			result = set.contains(c)? Math.max(result,set.size()) : Math.max(result, set.size()+1);
		}
		
		System.out.println(result);
	}

}
