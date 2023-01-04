package amgi;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution_5644_무선충전_해결 {

	static int T;
	static int M, A;// BC 개수 
	static class BC{
		int x;  //x좌표
		int y;  //y
		int c;  //충전번위 중심거리+1
		int p;  //성능
		int index;//번호
		public BC() {
		}
		public BC(int x, int y, int c, int p, int index) {
			this.x = x;
			this.y = y;
			this.c = c;
			this.p = p;
			this.index = index;
		}
		@Override
		public String toString() {
			return "BC [x=" + x + ", y=" + y + ", c=" + c + ", p=" + p + ", index=" + index + "]";
		}
	}
	static class L{
		int x;
		int y;
		public L() {
		}
		public L(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	// 모든 BC 저장
	static ArrayList<BC> bcs=new ArrayList<>();
	// A,B경로 정보를 저장
	static ArrayList<L> alist=new ArrayList<>();
	static ArrayList<L> blist=new ArrayList<>();
	// 범위안에 있는 BC저장
	static ArrayList<BC> inalist=new ArrayList<>();
	static ArrayList<BC> inblist=new ArrayList<>();
	static int [] dy= {0,-1,0,1,0}; // 노+상우하좌
	static int [] dx= {0, 0,1,0,-1};//0,1,2,3,4
	static int result;
	public static void main(String[] args) {
		Scanner scann=new Scanner(System.in);
		T=scann.nextInt();
		for (int t = 1; t <= T; t++) {
			bcs.clear();
			alist.clear();
			blist.clear(); //초기화 
			inalist.clear();
			inblist.clear(); //초기화 
			M=scann.nextInt();
			A=scann.nextInt();
			//0초일때도 포함시킨다.
			int x1=1;
			int y1=1;
			alist.add(new L(x1,y1));
			// A가 M초동안 이동한 정보를 저장한다.
			for (int i = 0; i < M; i++) {
				int d=scann.nextInt();
				x1=gox(x1,d);
				y1=goy(y1,d);
				alist.add(new L(x1,y1));
			}
			//0초일때도 포함시킨다.
			int x2=10;
			int y2=10;
			blist.add(new L(x2,y2));
			// B가 M초동안 이동한 정보를 저장한다.
			for (int i = 0; i < M; i++) {
				int d=scann.nextInt();
				x2=gox(x2,d);
				y2=goy(y2,d);
				blist.add(new L(x2,y2));
			}
			//모든 BC를 저장한다.
			for (int i = 0; i < A; i++) {
				bcs.add(new BC(scann.nextInt(),scann.nextInt(),scann.nextInt(), scann.nextInt(),i) );
			}
			//<--읽기
			//로직
			// M초 동안 이동하면서 충전확인
			result=0;
			for (int i = 0; i < M+1; i++) {//0초에서 M초
				// 한칸 이동후 
				L a=alist.get(i);
				L b=blist.get(i);
				// 현재 위치에서 BC에 충전되어 있는 상태 체크
				for (int j = 0; j < A; j++) {
					BC bc=bcs.get(j);
					int d1=distance(new L(bc.x, bc.y),a);
					int d2=distance(new L(bc.x, bc.y),b);
					if(bc.c>=d1) {// A 충전 범위
						inalist.add(bc);
					}
					if(bc.c>=d2) {// B 충전 범위
						inblist.add(bc);
					}
				}
				/*
				System.out.println("-----T"+i+"초");
				for (BC inb: inalist) {
					System.out.println(inb);
				}
				System.out.println("--------------");
				for (BC inb: inblist) {
					System.out.println(inb);
				}
				System.out.println("==================");
				*/
				// 한칸 이동 한 곳에서 BC와 최대값을 구한다. 
				int val=0;
				// A위치에서 범위안 BC가 없다. 
				if(inalist.size()==0) {
					for (BC inb: inblist) {
						val=Math.max(val, inb.p);
					}
				}else if(inblist.size()==0) {// B위치에서 범위안 BC가 없다. 
					for (BC inb: inalist) {
						val=Math.max(val, inb.p);
					}
					// A,B위치에서 범위안 BC가 있다.
					/*
					-----T11초
					BC [x=4, y=4, c=1, p=100, index=0]
					BC [x=6, y=3, c=2, p=70, index=2]
					--------------
					BC [x=4, y=4, c=1, p=100, index=0]
					*/
				}else if(inalist.size()>0 && inblist.size()>0) {
					for (int j = 0; j < inalist.size(); j++) {
						for (int k = 0; k < inblist.size(); k++) {
							//같은 BC에 A, B가 모두 있다. 반을 나눠합치면 원래 한개
							if(inalist.get(j).index==inblist.get(k).index) {
								val=Math.max(val, inalist.get(j).p);
							}else { //다른 BC에 A, B또는 B,A가 있다. 
								val=Math.max(val, inalist.get(j).p+inblist.get(k).p);
							}
							//결국 구한것중 최대?
						}
					}
				}
				result+=val;
				inalist.clear();//각 초마다 그 위치에서 BC 범위안에 있는것을 구하기 위해 지우고 시작!!!
				inblist.clear(); 
			}
			System.out.println("#"+t+" "+result);
		}
	}
	public static int distance(L l1,L l2) {
		return Math.abs(l1.x-l2.x)+Math.abs(l1.y-l2.y);
	}
	private static int goy(int y1, int d) {
		return y1+dy[d];
	}

	private static int gox(int x1, int d) {
		return x1+dx[d];
	}

}
