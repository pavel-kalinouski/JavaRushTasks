package com.javarush.task.task07.task0727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
    Меняем функциональность
    Задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter). Потом она конвертирует
    строки в верхний регистр (Мама превращается в МАМА) и выводит их на экран.

    Новая задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
    Потом программа строит новый список.
    Если в строке чётное число букв, строка удваивается, если нечётное - утраивается.
    Программа выводит содержимое нового списка на экран.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    //создание списка строк
        ArrayList<String> strings = new ArrayList<String>();
        //добавление строки и условие Exit-a
        while (true) {
            String string = reader.readLine();
            if (string == null || string.isEmpty()) break;
            strings.add(string);
        }

        //повторение строк
        ArrayList<String> resultStrings = new ArrayList<String>();
        for (int i = 0; i < strings.size(); i++) {
            String string = strings.get(i);
            int len = string.length();
            if (len % 2 == 0) string = string + " " + string;
            else if(len % 2 != 0) string = string + " " + string + " " + string;
            resultStrings.add(string);
        }

        //вывод списка на экран
        for (int i = 0; i < resultStrings.size(); i++) {
            System.out.println(resultStrings.get(i));
        }
    }
}
