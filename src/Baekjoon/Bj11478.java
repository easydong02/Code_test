package Baekjoon;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Bj11478 {
	static boolean[] visited;
	static Set<String> set;
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String str = sc.nextLine();
		visited=new boolean[str.length()];
		set= new HashSet<>();
		
		for (int i = 1; i <= str.length(); i++) {
			for (int j = 0; j < str.length()-i+1; j++) {
				set.add(str.substring(j,j+i));
			}
		}
		System.out.println(set.size());
//		Iterator<String> it = set.iterator();
//		while(it.hasNext()) {
//			System.out.print(it.next()+" ");
//		}
	}

}
