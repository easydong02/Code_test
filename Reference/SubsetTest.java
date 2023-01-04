package amgi;


public class SubsetTest {
	
	
	static int[] p = {1,2,3,4,5};
	static int N= p.length;

	static boolean[] visited;
	static int count;
	
	public static void main(String[] args) {
		visited = new boolean[N];
		
		subset(0, 0);
		System.out.println(count);
		
	}

	private static void subset(int cnt, int tot) {
		if(cnt==N) {
			count++;
			for (int i = 0; i < N; i++) {
				if(visited[i])System.out.print(p[i]+" ");
				
			}
			System.out.println();
			System.out.println("-------------"+tot);
			return;
		}
		
		visited[cnt]= true;
		subset(cnt+1,tot +p[cnt]);
		
		visited[cnt]=false;
		subset(cnt+1,tot +p[cnt]);
		
	}

}
