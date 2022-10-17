package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Algo1_서울_15반_신동희 {

	static int N,S,M,result;
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N= Integer.parseInt(st.nextToken());
		S= Integer.parseInt(st.nextToken());
		M= Integer.parseInt(st.nextToken());
		
		//정답 학생 출력할 변수
		StringBuilder sb= new StringBuilder();
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int[] nums = new int[3];
			
			int sum=0; //팀의 총합
			boolean chk = true;//개인 능력치 합격 여부
			for (int j = 0; j < nums.length; j++) {
				nums[j]= Integer.parseInt(st.nextToken());
				sum += nums[j]; 
				if(nums[j]<M)chk=false; //한명이라도 기준에 부합하지 않으면 false
			}
			
			if(sum>=S && chk) { //총합이 S이상이고 chk가 그대로 true일 때
				result ++; //팀의 수 하나 증가
				for (int j = 0; j < nums.length; j++) {
					sb.append(nums[j]+" "); //그 팀의 멤버 능력치를 저장
				}
			}
		}
		
		System.out.println(result);
		System.out.println(sb.toString());
	}

}
