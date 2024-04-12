package Baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Bj10828_스택_스택_S4 {

    public static final String PUSH = "push";
    public static final String POP = "pop";
    public static final String SIZE = "size";
    public static final String EMPTY = "empty";
    public static final String TOP = "top";

    public static Stack<String> stack = new Stack<>();
    public static StringBuilder result = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());


        for(int i =0; i<t; i++){
            String str = br.readLine();

            if(str.startsWith(PUSH)){ //push
                String[] strArray = str.split(" ");
                stack.push(strArray[1]);
            } else{ //push 말고 다른 명령어
                goSwitchCase(str);
            }
        }
        System.out.println(result.toString());
    }

    private static void goSwitchCase(String str) {
        switch (str){
            case POP:
                if(stack.empty()){
                    result.append(-1).append("\n");
                }else{
                    String pop = stack.pop();
                    result.append(pop).append("\n");
                }
                break;
            case SIZE:
                int size = stack.size();
                result.append(size).append("\n");
                break;
            case EMPTY:
                boolean empty = stack.empty();
                result.append(empty? 1 : 0).append("\n");
                break;
            case TOP:
                if(stack.empty()){
                    result.append(-1).append("\n");
                }else {
                    String peek = stack.peek();
                    result.append(peek).append("\n");
                }
        }
    }
}
