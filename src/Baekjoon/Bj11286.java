package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;


public class Bj11286 {
	
	static int N;
	static PriorityQueue<Integer> nums = new PriorityQueue<>(new Comparator<Integer>() {
		@Override
		public int compare(Integer o1, Integer o2) {
			if(Math.abs(o1)> Math.abs(o2)) {
				return Math.abs(o1)-Math.abs(o2);
			}else if(Math.abs(o1)==Math.abs(o2)) {
				return o1-o2;
			}else {
				return -1;
			}
		}
	});
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		N= Integer.parseInt(br.readLine());
		StringBuilder sb= new StringBuilder();
		for (int i = 0; i < N; i++) {
			int tmp= Integer.parseInt(br.readLine());
			if( tmp != 0) {
				nums.offer(tmp);
			}else {
				if(nums.isEmpty())sb.append("0\n");
				else sb.append(nums.poll()).append("\n");
			}
		}
		
		System.out.println(sb.toString());
	}


}
