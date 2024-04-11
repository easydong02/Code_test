package Baekjoon.fourOperation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj1864_문어숫자_사칙연산_B2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String str;
        StringBuilder result = new StringBuilder();
        while (!(str = br.readLine()).equals("#")){
            int resultNum = 0;
            char[] charArray = str.toCharArray();
            for(int i = 0; i < charArray.length; i++){
                int num = makeNum(charArray[i]);
                resultNum += num*(int) Math.pow(8, charArray.length-1-i);
            }
            result.append(resultNum+"\n");
        }
        System.out.println(result.toString());
    }

    private static int makeNum(char c) {
        switch (c){
            case '-': return 0;
            case '\\': return 1;
            case '(': return 2;
            case '@': return 3;
            case '?': return 4;
            case '>': return 5;
            case '&': return 6;
            case '%': return 7;
            case '/': return -1;
        }

        return -2;
    }
}
