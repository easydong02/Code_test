package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj1476 {
	static final int EARTH = 15;
	static final int SUN = 28;
	static final int MOON = 19;
	static int e,s,m;
	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		e = Integer.parseInt(st.nextToken());
		s = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		int e_ =1, s_=1, m_=1;
		int result = 1;
		while(check(e_,s_,m_)) {
			e_++;
			s_++;
			m_++;
			if(e_ > EARTH) e_=1;
			if(s_ > SUN) s_=1;
			if(m_ > MOON) m_=1;
			
			result ++;
		}
		System.out.println(result);
	}
	
	private static boolean check(int e_, int s_, int m_) {
		if(e==e_&&s==s_&&m==m_)return false;
		return true;
	}

}
