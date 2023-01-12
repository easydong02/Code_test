package Baekjoon;

import java.util.Scanner;

public class Bj17478 {

	public static void main(String[] args) {
		String str= "\"재귀함수가 뭔가요?\"" ;
		String str2="\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어." ;
		String str3="마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지." ;
		String str4="그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"";
		String str5="라고 답변하였지.";
		
		String[] arr= {str,str2,str3,str4,str5};
		
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		nested(n,arr,0);
		
	}
	
	public static void nested(int n, String[] arr, int cnt) {
		if(cnt==0) {
			System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
			
		}
		String line = "____";
		
		for (int i = 0; i < cnt; i++) {
			System.out.print(line);
		}
		System.out.println(arr[0]);
		
		if(n>0) {
			for (int i = 1; i < 4; i++) {
				for (int j = 0; j < cnt; j++) {
					System.out.print(line);
				}
				System.out.println(arr[i]);
			}
			nested(--n, arr, cnt+1);
			
			for (int i = 0; i < cnt; i++) {
				System.out.print(line);
			}
			System.out.println(arr[4]);
			
		}else {
			for (int i = 0; i < cnt; i++) {
				System.out.print(line);
			}
			System.out.println("\"재귀함수는 자기 자신을 호출하는 함수라네\"");
			for (int i = 0; i < cnt; i++) {
				System.out.print(line);
			}
			System.out.println(arr[4]);
			
		}
		
		
  }

}