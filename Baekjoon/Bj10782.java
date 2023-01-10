package baekjoon;

import java.util.Scanner;

public class Bj10872 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int N = sc.nextInt();
		
		int total = 1;
		
		if(N !=0) {
			
			for (int i = N; i >0; i--) {
				total *= i;
			}
		}else {
			System.out.println(1);
			System.exit(0);
		}
		
		System.out.println(total);

	}

}
