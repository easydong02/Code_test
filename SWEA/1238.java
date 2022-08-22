package hwalgo16_서울_15반_신동희;

import java.awt.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;

public class Solution_1238_Contact {
	static class Node{
		int from;
		int to;
		int level;
		public Node(int from, int to) {
			super();
			this.from = from;
			this.to = to;
		}
		public Node(int from, int to, int level) {
			super();
			this.from = from;
			this.to = to;
			this.level=level;
		}
		
		@Override
		public boolean equals(Object obj) {
	        if (obj instanceof Node) {
	            Node pt = (Node)obj;
	            return this.hashCode()==pt.hashCode();
	        }
	        return super.equals(obj);
		}
		
		@Override
		public int hashCode() {
			return (this.from+" "+this.to).hashCode();
		}
	}
	
	static Set<Node> set= new HashSet<>();
	static int N,start;
	static List<Integer> visited;
	static List<Integer> levels;
	static int maxLevel;
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine());
		
		N=Integer.parseInt(st.nextToken());
		start=Integer.parseInt(st.nextToken());
		st= new StringTokenizer(br.readLine());
		for (int i = 0; i < N/2; i++) {
			int from = Integer.parseInt(st.nextToken());
			int to = Integer.parseInt(st.nextToken());
			set.add(new Node(from,to));
		}//end of reading
		
		bfs();
		
	}
	private static void bfs() {
		visited=new ArrayList<Integer>();
		levels=new ArrayList<Integer>();
		Queue<Node> que = new LinkedList<Node>();
		Iterator<Node> it = set.iterator();
		maxLevel=Integer.MIN_VALUE;
		while(it.hasNext()) {
			Node n = it.next();
			if(n.from==start) {
				que.offer(new Node(n.from,n.to,0));
			}
		}
		while(!que.isEmpty()) {
			Node cur= que.poll();
			int from= cur.from;
			int to= cur.to;
			if(check(to)) {
				visited.add(from);
				Iterator<Node> it2 = set.iterator();
				while(it2.hasNext()) {
					Node n = it2.next();
					if(n.from==to && check(n.to)) {
						Node tmp= new Node(to,n.to,cur.level+1);
						que.offer(tmp);
						visited.add(tmp.from);
						if(tmp.level>maxLevel) {
							maxLevel= tmp.level;
							levels.clear();
							levels.add(tmp.to);
						}else if(tmp.level==maxLevel) {
							levels.add(tmp.to);
						}
					}
				}
			}
			
		}
		int result= 0;
		for (int i = 0; i < levels.size(); i++) {
			result = Math.max(levels.get(i), result);
		}
		System.out.println(result);
		
	}
	private static boolean check(int to) {
		for (int i = 0; i < visited.size(); i++) {
			if(visited.get(i)==to) {
				return false;
			}
		}
		return true;
	}

}
