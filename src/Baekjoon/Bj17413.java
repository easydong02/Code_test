package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj17413 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean chk = true;
		char[] chars = br.readLine().toCharArray();
		StringBuilder sb = new StringBuilder();
		StringBuilder flip = new StringBuilder();
		for (int i = 0; i < chars.length; i++) {
			char cur = chars[i];
			if (cur == '>') {
				sb.append(cur);
				chk = true;
				continue;
			}
			if (cur == '<') {
				chk = false;
				sb.append(flip.reverse());
				flip = new StringBuilder();
			}
			if (cur == ' ') {
				if (chk) {
					sb.append(flip.reverse() + " ");
					flip = new StringBuilder();
					continue;
				}
			}

			if (chk) {
				flip.append(cur);
			} else {
				sb.append(cur);
			}
		}
		if (flip.toString().length() > 0) {
			sb.append(flip.reverse());
		}
		System.out.println(sb.toString());
	}

}
