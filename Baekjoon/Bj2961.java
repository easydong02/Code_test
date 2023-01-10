package algo0817;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main_2961_도영이 {
	static int N,result,sour,bitter;
	static int min= Integer.MAX_VALUE;
	static List<int[]> taste;
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		N= Integer.parseInt(br.readLine());
		taste = new  ArrayList<int[]>();
		for (int i = 0; i < N; i++) {
			StringTokenizer st =new StringTokenizer(br.readLine());
			taste.add(new int[] {Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())});
		}
		
		if(N==1) {
			int [] temp= taste.get(0);
			System.out.println(Math.abs(temp[0]-temp[1]));
			System.exit(0);
		}
		
		for (int i = 1; i < (1<<N); i++) {
			sour=1;
			bitter=0;
			result=0;
			for (int j = 0; j < N; j++) {
				if((i & (1<<j)) !=0) {
					int[] cur = taste.get(j);
					sour *=cur[0];
					bitter +=cur[1];
					
				}
			}
			result = Math.abs(sour-bitter);
			if(result<min) {
				min=result;
			}
		}
		
		
		System.out.println(min);
	}
	
	
}
