package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj10822 {

	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String[] arr= br.readLine().split(",");
		int result = 0;
		
		for (int i = 0; i < arr.length; i++) {
			result += Integer.parseInt(arr[i]);
		}
		System.out.println(result);
	}

}
