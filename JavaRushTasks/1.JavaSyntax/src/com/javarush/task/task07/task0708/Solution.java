package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
    1. Создай список строк.
    2. Считай с клавиатуры 5 строк и добавь в список.
    3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран. Если таких строк несколько, выведи каждую с новой строки.
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        //1. Создай список строк.
        //2. Считай с клавиатуры 5 строк и добавь в список.
        strings = new ArrayList<>();
        int maxLen = 0;
        int listSize = 5;
        for(int i = 0; i < 5; i++){
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            strings.add(reader.readLine());

            String sItem = strings.get(i);
            int sLen = sItem.length();
            //3. Используя цикл, найди самую длинную строку в списке.
            if (sLen > maxLen) {
                maxLen = sLen;
            }

        }
        //4. Выведи найденную строку на экран. Если таких строк несколько, выведи каждую с новой строки.
        for(int i = 0; i < listSize; i++){
            String sItem = strings.get(i);
            if (sItem.length() == maxLen){
                System.out.println(sItem);
            }
        }


    }
}
