package hwalgo22_서울_15반_신동희;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1149 {
	static int N,homes[], paints[][];
	static int min = 1001;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		N= Integer.parseInt(br.readLine());
		
		
		paints= new int[N+1][3];
		
		for (int i = 1; i <= N; i++) {
			StringTokenizer st= new StringTokenizer(br.readLine());
			int r = Integer.parseInt(st.nextToken());
			int g = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			paints[i][0]= Math.min(paints[i-1][1], paints[i-1][2]) +r;
			paints[i][1]= Math.min(paints[i-1][0], paints[i-1][2]) +g;
			paints[i][2]= Math.min(paints[i-1][0], paints[i-1][1]) +b;
		}//end of reading
		
		
		System.out.println(Math.min( Math.min(paints[N][0], paints[N][1]), paints[N][2]));
		
		
	}

}
