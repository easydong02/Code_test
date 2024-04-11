package Baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Bj9012_괄호_스택_S4 {

    public static final String YES = "YES";
    public static final String NO = "NO";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        StringBuilder result = new StringBuilder();

        for (int i = 0; i<t; i++){
            boolean chk = true;
            String str = br.readLine();
            Stack<String> stack = new Stack<>();

            for(int j=0;j<str.length();j++){
                String substring = str.substring(j, j + 1);
                if(substring.equals("(")){
                    stack.add(substring);
                }else {
                    if(stack.empty()){
                        chk = false;
                        break;
                    }
                    stack.pop();
                }
            }
            if(chk && stack.empty())result.append(YES+"\n");
            else result.append(NO+"\n");
        }

        System.out.println(result.toString());

    }
}
