package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
    Омовение Рамы
    Написать программу, которая вводит с клавиатуры строку текста.
    Программа заменяет в тексте первые буквы всех слов на заглавные.
    Вывести результат на экран.
    - Пример ввода:
    -- мама мыла раму.
    - Пример вывода:
    -- Мама Мыла Раму.
    Требования:
    1. Программа должна выводить текст на экран.
    2  . Программа должна считывать строку с клавиатуры.
    3. Класс Solution должен содержать один метод.
    4. Программа должна заменять в тексте первые буквы всех слов на заглавные.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        //напишите тут ваш код
        string = string.trim();
        String[] words = string.split(" +");
        for(String s : words){
            String temp = s.toUpperCase();
            char toReplaceWith = temp.charAt(0);
            //System.out.println(toReplaceWith);

            s = s.replace(Character.toString(s.charAt(0)),Character.toString(toReplaceWith));
            System.out.print(s + " ");
        }
    }
}
