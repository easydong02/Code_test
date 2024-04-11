package Baekjoon.fourOperation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj3029_경고_사칙연산_B3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        String start = br.readLine();
        String end = br.readLine();

        String[] startSplit = start.split(":");
        String[] endSplit = end.split(":");

        int startHour = Integer.parseInt(startSplit[0]);
        int startMinute = Integer.parseInt(startSplit[1]);
        int startSecond = Integer.parseInt(startSplit[2]);

        int endHour = Integer.parseInt(endSplit[0]);
        int endMinute = Integer.parseInt(endSplit[1]);
        int endSecond = Integer.parseInt(endSplit[2]);

        int resultHour = 0;
        int resultMinute = 0;
        int resultSecond = 0;

        if(endSecond >= startSecond){
            resultSecond = endSecond - startSecond;
        }else{
            resultSecond = endSecond - startSecond + 60;
            endMinute -=1;
        }

        if(endMinute >= startMinute){
            resultMinute += (endMinute - startMinute);
        }else{
            resultMinute += (endMinute - startMinute + 60);
            endHour -=1;
        }

        if(endHour >= startHour){
            resultHour += (endHour - startHour);
        }else {
            resultHour += (endHour - startHour + 24);
        }

        StringBuilder result = new StringBuilder();

        if(resultHour == 0 && resultMinute == 0 && resultSecond == 0) {
            result.append("24:00:00");
        }else{
            result.append(resultHour<10? "0"+String.valueOf(resultHour) :String.valueOf(resultHour) );
            result.append(":");
            result.append(resultMinute<10? "0"+String.valueOf(resultMinute) :String.valueOf(resultMinute) );
            result.append(":");
            result.append(resultSecond<10? "0"+String.valueOf(resultSecond) :String.valueOf(resultSecond) );
        }

        System.out.println(result.toString());
    }
}
