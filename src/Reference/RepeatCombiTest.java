package Reference;

import java.util.Arrays;

public class RepeatCombiTest {
	
	
	static int[] p = {0,1,2,3,4,5,6,7,8,9,10};
	static int[] ryan = {2,1,1,1,0,0,0,0,0,0,0};
	static int N= p.length;
	static int R;

	static int count;
	
	public static void main(String[] args) {
		R=5;
		
		npr(0, new int[R]);
		System.out.println(count);
		
	}

	private static void npr(int cnt, int[] nums) {
		if(cnt==R) {
			count++;
			System.out.println(Arrays.toString(nums));
			return;
		}
		
		for (int i = 0; i < N; i++) {
			nums[cnt]= p[i];
			npr(cnt+1,nums);
			
			nums[cnt]=0;
		}
		
	}

}
