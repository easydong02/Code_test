package Baekjoon.fourOperation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj22864_피로도_사칙연산_B2 {
    static int A;
    static int B;
    static int C;
    static int M;
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int P = 0;
        int result = 0;
        int hour = 0;

        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        // 종료 조건
        while(hour < 24){
            //일 가능?
            if(P + A <= M){
                //1시간 일했음
                P += A;
                result += B;
            }else{
                //1시간 쉬었음
                P -= C;
                P = Math.max(P, 0);
            }

            hour +=1;
        }

        System.out.println(result);
    }
}
