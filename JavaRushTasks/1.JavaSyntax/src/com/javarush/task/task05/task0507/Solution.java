package com.javarush.task.task05.task0507;
import java.io.*;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double sum = 0;
        int count = 0;
        double average = 0;

        boolean isExit = false;
        while (!isExit){
            double number = Integer.parseInt(reader.readLine());
            if (number == -1){
                isExit = true;
                average = sum / count;
                System.out.println(average);
                break;
            }
            count++;
            sum += number;
        }

    }
}

