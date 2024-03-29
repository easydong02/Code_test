package Reference;

public class PowerSet {
	static int[] p= {1,2,3,4,5};
	static int N= p.length;
	
	public static void main(String[] args) {
		
		for (int i = 0; i < (1<<N); i++) {
			for (int j = 0; j < N; j++) {
				if((i & (1<<j))!=0)continue;
				System.out.printf(p[j]+" ");
			}
			System.out.println();
		}
	}

}

// 0 0&1   0 & 10   0 & 100  0& 1000 0 & 10000
// 1 1&1   1 & 10   1 & 100  1& 1000 1 & 10000
// 2 10&1   10 & 10   10 & 100  10& 1000  10 & 10000