package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Bj15904 {
	private static final String answer = "I love UCPC";
	private static final String fail = "I hate UCPC";
	private static final String[] answers = {"U","C","P","C"};
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String str =br.readLine();
		
		Queue<String> queue = new LinkedList<String>();
		
//		for (int i = 0; i < arr.length; i++) {
//			String tmp = arr[i].substring(0,1);
//			queue.add(tmp);
//		}
//		
		int cnt =0;
//		while(!queue.isEmpty()) {
//			String tmp = queue.poll();
//			if(tmp.equals(answers[cnt])) {
//				cnt++;
//				if(cnt==4)break;
//			}
//		}
		
		for (int i = 0; i < str.length(); i++) {
			if(str.substring(i,i+1).equals(answers[cnt])) {
				cnt++;
				if(cnt ==4)break;
			}
		}
		if(cnt==4) {
			System.out.println(answer);
		}else {
			System.out.println(fail);
		}
	}

}
