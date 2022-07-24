package swea.d1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Swea2070 {
	static int T;
		
	public static void main(String[] args) throws Exception {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		T= Integer.parseInt(br.readLine());
		
		for (int testcase = 1; testcase <= T; testcase++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] nums = new int[2];
			
			for (int i = 0; i < nums.length; i++) {
				nums[i]= Integer.parseInt(st.nextToken());
			}
			
			if(nums[0]>nums[1]) {
				System.out.println("#"+testcase+" "+">");
			}else if(nums[0]<nums[1]) {
				System.out.println("#"+testcase+" "+"<");
			}else {
				System.out.println("#"+testcase+" "+"=");
				
			}
		}
	}

}
