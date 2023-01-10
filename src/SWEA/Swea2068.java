package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Swea2068 {
	static int T;
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		T = Integer.parseInt(br.readLine());
		
		for (int testcase = 1; testcase <= T; testcase++) {
			int max=Integer.MIN_VALUE;
			int[] nums= new int[10];
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			for (int i = 0; i < 10; i++) {
				nums[i] = Integer.parseInt(st.nextToken());
			}
			
			for (int i = 0; i < nums.length; i++) {
				if(nums[i]>max) {
					max=nums[i];
				}
			}
			System.out.println("#"+testcase+" "+max);
			
		}

	}

}
