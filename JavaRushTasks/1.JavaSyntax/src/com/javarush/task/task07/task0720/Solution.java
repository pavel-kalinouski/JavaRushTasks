package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
    Ввести с клавиатуры 2 числа N и M.
    Ввести N строк и заполнить ими список.
    Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.

    Примечание: запрещено создавать больше одного списка.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //Ввести с клавиатуры 2 числа N и M.
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        int M = Integer.parseInt(reader.readLine());

        if (M>N) System.out.println("M should be <= N");
        else {
            // Ввести N строк и заполнить ими список.
            //System.out.println("Enter ArrayList with " + N + " numbers:");
            ArrayList<String> listFromKeyboard = new ArrayList<String>();
            for (int i = 0; i < N; i++) {
                String sItem = reader.readLine();
                listFromKeyboard.add(sItem);
            }
            //Переставить M первых строк в конец списка.
            int counter = 0;
            while (counter < M){
                String firstItem = listFromKeyboard.get(0);
                listFromKeyboard.add(firstItem);
                listFromKeyboard.remove(0);
                counter++;
            }
            //Вывести список на экран, каждое значение с новой строки.
            for (String item : listFromKeyboard) System.out.println(item);

        }


    }
}
