package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Bj4949 {

	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb= new StringBuilder();
		while(true) {
			Stack<Character> stck = new Stack<>();
			
			boolean chk = true;
			String temp= br.readLine();
			if(temp.equals("."))break;
			
			char[] arr= temp.toCharArray();
			
			
			for (int i = 0; i < arr.length; i++) {
				char a= arr[i];
				if(a=='.')break;
				if(a=='(' || a=='[') {
					stck.add(a);
				}else if (a==')' || a==']') {
					if(stck.isEmpty()) {
						chk=false;
						break;
					}
					char tmp = stck.pop();
					if(((a==')' && tmp=='(') || (a==']'&& tmp=='['))) {
						continue;
					}
					else {
						chk=false;
						break;
					}
				}
			}
			if(chk && stck.isEmpty())sb.append("yes\n");
			else sb.append("no\n");
		}
		
		System.out.println(sb.toString());
	}


}
