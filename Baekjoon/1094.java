import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Main {
	
	static int T,X,sum;
	static PriorityQueue<Integer> que;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
			sum =0; 
			X = Integer.parseInt(br.readLine());
			que = new PriorityQueue<>();
			que.offer(64);
			sum += 64;
			while(sum != X) {
				if(sum>X) {
					int cur = que.poll()/2;
					if(sum - cur>=X) {
						sum -=cur;
						que.offer(cur);
					}else {
						que.offer(cur);
						que.offer(cur);
					}
				}
			}
		System.out.println(que.size());
	}

}
