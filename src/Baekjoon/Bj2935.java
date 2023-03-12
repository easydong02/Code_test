package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj2935 {

	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		String a = br.readLine();
		String opp = br.readLine();
		String b =br.readLine();
		
		StringBuilder A = new StringBuilder().append(a);
		StringBuilder B = new StringBuilder().append(b);
		
		if(opp.equals("*")) {
			for (int i = 0; i < b.length()-1; i++) {
				A.append("0");
			}
			System.out.println(A.toString());
		}else {
			if(a.length()>b.length()) {
				char[] aArr = a.toCharArray();
				aArr[aArr.length - b.length()] = '1';
				System.out.println(String.valueOf(aArr));
			}else if(a.length()<b.length()) {
				char[] bArr = b.toCharArray();
				bArr[bArr.length - a.length()] = '1';
				System.out.println(String.valueOf(bArr));
			}else {
				char[] aArr = a.toCharArray();
				aArr[0] = '2';
				System.out.println(String.valueOf(aArr));
			}
		}
	}

}
