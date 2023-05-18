package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj25304 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		int total = Integer.parseInt(br.readLine());
		
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n; i++) {
			String[] str = br.readLine().split(" ");
			
			total -= Integer.parseInt(str[0])*Integer.parseInt(str[1]);
		}
		
		if(total ==0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
