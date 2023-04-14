package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj25206 {
	static double N;
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		double sum = 0.0;
		for (int i = 0; i < 20; i++) {
			String[] arr= br.readLine().split(" ");
			double num = Double.parseDouble(arr[1]);
			String score1 = arr[2].substring(0,1);
			String score2 = "";
			if(!score1.equals("P")) {
				if(!score1.equals("F")) {
					score2 = arr[2].substring(1,2);
				}
				N += num;
				double intScore1 = score1.equals("A")? 4.0:score1.equals("B")? 3.0:score1.equals("C")? 2.0:score1.equals("D")? 1.0 : 0.0;
				double intScore2 = score2.equals("+")? 0.5: score2.equals("0")? 0.0 : 0.0;
				sum += num * (intScore1+intScore2);
			}
		}
		System.out.println(sum/N);
	}

}
