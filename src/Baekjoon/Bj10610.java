package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Bj10610 {

	public static void main(String[] args) throws IOException {
		//30의 배수 = 일단 0이 하나도 없으면 탈락.  
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String n = br.readLine();
		int totalChk =0;
		int cnt=0;
		int[] nums = new int[10];
		for (int i = 0; i < n.length(); i++) {
			int temp = Integer.parseInt(n.substring(i, i+1));
			totalChk+=temp;
			nums[temp]++;
		}
		
		if(nums[0] ==0 || totalChk%3 !=0) {
			System.out.println(-1);
			System.exit(0);
		}
		
		StringBuilder result = new StringBuilder();
		for (int i = nums.length-1; i >=0 ; i--) {
			for (int j = 0; j < nums[i]; j++) {
				result.append(i);
			}
		}
		
		System.out.println(result.toString());
		
	}

}
