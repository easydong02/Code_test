package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj10820 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str = "";Eod
		while((str = br.readLine())!=null) {
			char[] arr =str.toCharArray();
			int s =0;
			int b =0;
			int n = 0;
			int g =0;
			
			for (int i = 0; i <arr.length; i++) {
				char tmp = arr[i];
				if((int)tmp==32)g++;
				else if((int)tmp>=48 && (int)tmp<=57)n++;
				else if((int)tmp>=65 && (int)tmp<=90)b++;
				else if((int)tmp>=97 && (int)tmp<=122)s++;
			}
			System.out.println(s+" "+b+" "+n+" "+g);
		}
	}

}
