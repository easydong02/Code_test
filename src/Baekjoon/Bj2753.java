package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj2753 {
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        boolean isYoon = false;
        if(N%4 == 0){
            if(N%100!=0 || N%400==0){
                isYoon = true;
            }
        }

        System.out.println(isYoon? 1 : 0);
    }
}
