package amgi;


public class SubsetTest_bit {
	static int [] p = {1,2,3,4,5};
	static int N=p.length;
	static int R;
	
	public static void main(String[] args) {
		for (int i = 0; i < (1<<N); i++) {
			for (int j = 0; j < N; j++) {
				if((i & (1<<j)) !=0) {
					System.out.print(p[j]+" ");
				}
			}
			System.out.println();
		}
	}


}
