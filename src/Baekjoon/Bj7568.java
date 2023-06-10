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
		
		public Student(int weight, int height) {
			this.height = height;
			this.weight = weight;
		}

		@Override
		public int compareTo(Student o) {
			if(this.weight > o.weight && this.height > o.height) {
				return 1;
			}else if (this.weight < o.weight && this.height < o.height) {
				return -1;
			}else {
				return 0;
			}
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		PriorityQueue<Student> que =new PriorityQueue<>();
		
		
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			que.add(new Student(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
		}
		
		
	}

}
