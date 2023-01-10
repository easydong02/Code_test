package Baekjoon;

import java.util.Scanner;

public class Bj2231 {
	static int N,result;
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		N= sc.nextInt();
		
		boolean chk= false;
		for (int i = 0; i < N; i++) {
			if(check(i)) {
				chk=true;
				result = i;
				break;
			}
		}
		if(chk)System.out.println(result);
		else System.out.println(0);
		
	}
	private static boolean check(int num) {
		if(num<10) {
			if(num*2 == N)return true;
		}else {
			int sum =num;
			while(num>0) {
				sum += num%10;
				num/=10;
			}
			if(sum == N)return true;
		}
		
		return false;
	}

}
