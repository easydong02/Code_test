package Baekjoon.fourOperation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Bj2729_이진수덧셈_사칙연산 {
    static int T;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        T = Integer.parseInt(br.readLine());
        //결과 이진수
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String num1 = st.nextToken();
            String num2 = st.nextToken();

            BigInteger bigInteger = new BigInteger(num1, 2);
            BigInteger bigInteger2 = new BigInteger(num2, 2);

            BigInteger add = bigInteger.add(bigInteger2);
            result.append(add.toString(2)+"\n");
        }
        System.out.println(result.toString());
    }
}
