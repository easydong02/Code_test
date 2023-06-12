package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Bj7568 {
	public static class Student implements Comparable<Student>{
		int height;
		int weight;
		int n;
		
		public Student(int weight, int height, int n) {
			this.height = height;
			this.weight = weight;
			this.n = n;
		}
		
		public int comp(Student o) {
			if(this.height > o.height && this.weight > o.weight )return 1;
			
			if(this.height < o.height && this.weight < o.weight)return -1;
			
			return 0;
		}

		@Override
		public int compareTo(Student o) {
			if(this.weight > o.weight && this.height > o.height) {
				return -1;
			}else if (this.weight < o.weight && this.height < o.height) {
				return 1;
			}else {
				return 0;
			}
		}
		
		@Override
		public String toString() {
			return this.height+", " +this.weight;
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		PriorityQueue<Student> que =new PriorityQueue<>();
		int[] result = new int[n];
		
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			que.add(new Student(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()),i));
		}
		int cnt = 1;
		int cum = 1;
		while(!que.isEmpty()) {
			Student st = que.poll();
			Student tmp = que.peek();
			if(tmp == null) {
				break;
			}
			
			if(st.comp(tmp) == 0) {
				result[st.n] = cnt;
				result[tmp.n] = cnt;
				cum += ++cnt;
			}else {
				result[tmp.n]=cum;
				cnt = cum;
				cum =1;
			}
		}
		
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]+" ");
		}
	}

}
