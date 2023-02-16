package Baekjoon;

import java.util.Scanner;

public class Bj10824 {
	
	static StringBuilder sb;
	static boolean more10 = false;
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		sb= new StringBuilder();
		String[] input = sc.nextLine().split(" ");
		
		String a = input[0]+input[1];
		String b= input[2]+input[3];
		
		
		
		int maxsize = Math.max(a.length(), b.length());
		int minsize = Math.min(a.length(), b.length());
		String big = a.length()> b.length()? a:b;
		
		if(maxsize==minsize) {
			go(a,b,maxsize);
			if(more10)sb.insert(0, 1);
		}else {
			go(a,b,minsize);
			
			for (int i = maxsize-minsize-1; i >=0; i--) {
				if(more10) {
					int num =Integer.parseInt(big.substring(i,i+1))+1;
					if(num>9) {
						sb.insert(0,num-10);
					}else {
						more10=false;
						sb.insert(0, num);
					}
				}else {
					sb.insert(0,big.substring(i,i+1));
				}
			}
		}
		
		System.out.println(sb.toString());
	}

	private static void go(String a, String b, int size) {
		int sizeA= a.length();
		int sizeB= b.length();
		
		while(size>0) {
			int numa = Integer.parseInt(a.substring(--sizeA,sizeA+1));
			int numb = Integer.parseInt(b.substring(--sizeB,sizeB+1));
			int plus1 = more10? 1:0;
			if(numa+numb+plus1>9) {
				more10=true;
				sb.insert(0,(numa+numb+plus1-10));
			}else {
				more10=false;
				sb.insert(0,(numa+numb+plus1));
			}
			size--;
		}
	}

}
