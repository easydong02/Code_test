package algo0816;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_2630_색종이만들기 {
	static int N; 
	static int[][] map;
	static int cnt1,cnt0;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		N= Integer.parseInt(br.readLine()); 
		map= new int[N][N];
		for (int i = 0; i < N; i++) {
			StringTokenizer st =new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				map[i][j]= Integer.parseInt(st.nextToken());
			}
		}// end of reading
		
		
		dfs(map,0,0,N,N); //로직
		
		
//		for(int[] m : map) {
//			System.out.println(Arrays.toString(m));
//		}
		
		System.out.println(cnt0);
		System.out.println(cnt1);
		
	}
	private static void dfs(int [][] array,int x1,int y1, int x2, int y2) {
		
		if(check1(array,x1,y1,x2,y2) ) { //전부 1이면 1추가
			cnt1++;
			return;
		}else if(check0(array,x1,y1,x2,y2) ) { //전부 0이면 0추가
			cnt0++;
			return;
		}
		
//		if(checkOne(array,x1,y1,x2,y2)) { //4개짜리 사각형 남았을때 들어가는 메서드
//			return;
//		}
		
		dfs(array,x1,y1,(x1+x2)/2,(y1+y2)/2);//왼쪽 위
		
		dfs(array,x1,(y1+y2)/2,(x1+x2)/2,y2);//오른쪽 위
		
		dfs(array,(x1+x2)/2,y1,x2,(y1+y2)/2);//왼쪽 아래
		
		dfs(array,(x1+x2)/2,(y1+y2)/2,x2,y2);//오른쪽 아래
		
	}
	
	
	private static boolean checkOne(int[][] array, int x1, int y1, int x2, int y2) {
		if(x2-x1==2 && y2-y1==2) {
			if(array[x1][y1]==1) {
				cnt1++;
			}else {
				cnt0++;
			}
			
			return true;
		}
		return false;
	}
	
	private static boolean check0(int[][] array, int x1, int y1, int x2, int y2) {
		for (int i = x1; i < x2; i++) {
			for (int j = y1; j < y2; j++) {
				if(array[i][j] !=0)return false;
			}
		}
		return true;
	}
	
	private static boolean check1(int[][] array, int x1, int y1, int x2, int y2) {
		for (int i = x1; i < x2; i++) {
			for (int j = y1;j < y2; j++) {
				if(array[i][j] !=1)return false;
			}
		}
		return true;
	}

}
