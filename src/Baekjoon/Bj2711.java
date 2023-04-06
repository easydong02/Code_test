package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj2711 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N; i++) {
			String[] str= br.readLine().split(" ");
			
			String[] arr = str[1].split("");
			arr[Integer.parseInt(str[0])-1]="";
			System.out.println(String.join("", arr));
		}
	}

}
