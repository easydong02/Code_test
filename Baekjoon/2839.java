package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj2839 {
	static int N;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		int cnt =N/3;
		
		if(N%5 ==0) {
			System.out.println(N/5);
			System.exit(0);
		}
		
		for (int i = 0; i <= cnt; i++) {
			for(int j =0; j<=cnt; j++) {
				if((3*i + 5*j)==N) {
					System.out.println(i +j);
					System.exit(0);
				}
			}
		}
		System.out.println(-1);
		
	}

}
