package Baekjoon.fourOperation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Bj21312_홀짝칵테일_사칙연산_B3 {

    static int A;
    static int B;
    static int C;
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        List<Integer> nums = new ArrayList<>();

        if(A%2!=0) nums.add(A);
        if(B%2!=0) nums.add(B);
        if(C%2!=0) nums.add(C);

        int result = 1;

        if(nums.size() == 0){
            result = A*B*C;
        } else{
            for (Integer num : nums) {
                result *=num;
            }
        }

        System.out.println(result);
    }
}
