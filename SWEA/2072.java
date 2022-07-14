package start02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D1_2072 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			int[] a = new int[10];
			int sum = 0;
			StringTokenizer st= new StringTokenizer(br.readLine());
			
			for (int j = 0; j < 10; j++) {
				a[j] = Integer.parseInt(st.nextToken());

			}

			for (int n : a) {
				if (n % 2 != 0) {
					sum += n;
				}
			}

			System.out.println("#"+(i+1)+" "+sum);

		}

	}

}
