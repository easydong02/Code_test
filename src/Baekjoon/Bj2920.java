package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj2920 {

	static int[] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st= new StringTokenizer(br.readLine());
		arr= new int[8];
		for (int i = 0; i < 8; i++) {
			arr[i]= Integer.parseInt(st.nextToken());
		}//end of reading
		
		boolean chk = true;
		int dist= arr[1]-arr[0];
		
		for (int i = 0; i < 7; i++) {
			if(arr[i+1]-arr[i] != dist) {
				chk =false;
				break;
			}
		}
		
		if(!chk) {
			System.out.println("mixed");
		}else {
			if(dist==1)System.out.println("ascending");
			else if(dist==-1)System.out.println("descending");
		}
	}

}
