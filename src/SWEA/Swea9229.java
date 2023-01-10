package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Swea9229 {
	
	static int T,N,M;
	static int[] snacks;
	
	static boolean[] visited;
	static List<Integer> comb;
	static int[] temp;

	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		temp= new int[2];
		T= Integer.parseInt(br.readLine());
		
		for (int tc = 1; tc <= T; tc++) {
			comb = new ArrayList<Integer>();
			int max= Integer.MIN_VALUE;
			StringTokenizer st= new StringTokenizer(br.readLine());
			N= Integer.parseInt(st.nextToken());//봉지 개수
			M= Integer.parseInt(st.nextToken());//무게제한
			snacks= new int[N];
			st= new StringTokenizer(br.readLine());
			for (int a = 0; a < N; a++) {
				snacks[a]= Integer.parseInt(st.nextToken());//각 봉지 무게
			}// end of reading
			
			
			
			combi(0,0); //조합 발동
			
			for (int i = 0; i < comb.size(); i++) {
				if(comb.get(i)>=max && comb.get(i)<=M) {
					max= comb.get(i);
				}
			}
			
			if(max==Integer.MIN_VALUE) {
				System.out.println("#"+tc+" "+-1);
			}else {
				System.out.println("#"+tc+" "+max);
			}
			
		}
		
	}

	private static void combi(int cnt, int start) {
		if(cnt==2) {
			int sum = temp[0]+temp[1];
			comb.add(sum);
			return;
		}
		
		for (int i = start; i < N; i++) {
			temp[cnt]= snacks[i];
			combi(cnt+1,i+1);
		}
		
	}

}
