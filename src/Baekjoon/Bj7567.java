package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class Bj7567 {
	
	static Stack<String> stack;
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		stack= new Stack<>();
		
		String str= br.readLine();
		int result = 10 ;
		for (int i = 0; i < str.length(); i++) {
			String tmp = str.substring(i,i+1);
			if(!stack.isEmpty()) {
				String tmp2 = stack.pop();
				if(tmp.equals(tmp2)) {
					result +=5;
				}else {
					result +=10;
				}
			}
			stack.add(tmp);
		}
		
		System.out.println(result);
		
		
	}

}
