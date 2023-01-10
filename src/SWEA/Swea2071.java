package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Swea2071 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());

		for (int t = 1; t <= T; t++) {
			int[] a = new int[10];
			int sum = 0;
			StringTokenizer st= new StringTokenizer(br.readLine());
			
			for (int j = 0; j < 10; j++) {
				a[j] = Integer.parseInt(st.nextToken());

			}

			for (int n : a) {
				sum +=n;
			}
			

			System.out.println(String.format("#%d %.0f",t ,(double)sum/10));

		}

	}

}
