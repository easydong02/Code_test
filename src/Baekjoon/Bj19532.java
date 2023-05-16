package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj19532 {

	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		String[] arr = br.readLine().split(" ");
		
		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[1]);
		int c = Integer.parseInt(arr[2]);
		int d = Integer.parseInt(arr[3]);
		int e = Integer.parseInt(arr[4]);
		int f = Integer.parseInt(arr[5]);
		int tmp =a;
		a *=d;
		b *=d;
		c *=d;
		
		d *=tmp;
		e *=tmp;
		f *=tmp;
		int y =0;
		int x =0;
		y = (c-f)/(b-e);
		
		x = (c-b*y)/a;
		
		System.out.println(x+" "+y);
	}

}
