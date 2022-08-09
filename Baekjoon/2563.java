package hwalgo07_서울_15반_신동희;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2563 {
	static int N,X,Y;
	static int result;
	static int[][] map = new int[100][100];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		N= Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			X= Integer.parseInt(st.nextToken());
			Y= Integer.parseInt(st.nextToken());
			
			for (int j = X; j < X+10 ; j++) {
				for (int k = Y; k < Y+10; k++) {
					map[k][j] +=1;
				}
			}
			
		}
		
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				if(map[i][j] !=0) {
					result ++;
				}
			}
		}
		
		System.out.println(result);

	}

}
