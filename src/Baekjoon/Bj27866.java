package Baekjoon;

import java.util.Scanner;

public class Bj27866 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String str = sc.nextLine();
		
		int N = sc.nextInt();
		
		System.out.println(str.substring(N-1,N));
	}

}
