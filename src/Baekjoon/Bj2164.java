package Baekjoon;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Bj2164 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Queue<Integer> cards= new LinkedList<>();
		
		for (int i = 1; i <= N; i++) {
			cards.offer(i);
		}
		
		while(cards.size()>1) {
			cards.poll();
			cards.offer(cards.poll());
			
		}
		
		System.out.println(cards.peek());
	}

}
