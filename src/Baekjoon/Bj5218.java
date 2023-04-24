package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj5218 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringBuilder result = new StringBuilder();
		
		for (int i = 0; i < n; i++) {
			StringTokenizer st= new StringTokenizer(br.readLine());
			result.append("Distances: ");
			char[] a1 = st.nextToken().toCharArray();
			char[] a2 = st.nextToken().toCharArray();
			for (int j = 0; j < a1.length; j++) {
				if(a1[j]>a2[j]) {
					result.append('Z'-a1[j]+(a2[j]-'A')+1);
				}else {
					result.append(a2[j]-a1[j]);
				}
				result.append(" ");
			}
			result.append("\n");
		}
		System.out.println(result.toString());
	}

}
