package com.javarush.task.task07.task0709;

/* 
    Выражаемся покороче
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую короткую строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        //1. Создай список строк.
        ArrayList<String> listFromKeyboard = new ArrayList<>();
        //2. Считай с клавиатуры 5 строк и добавь в список.
        //3. Используя цикл, найди самую короткую строку в списке.
        int sizeOflistFromKeyboard = 5;
        int minLen = Integer.MAX_VALUE;
        for (int i = 0; i < sizeOflistFromKeyboard; i++ ){
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            listFromKeyboard.add(reader.readLine());
            // find the shortest string length
            int sLength = listFromKeyboard.get(i).length();
            if (sLength < minLen) {
                minLen = sLength;
            }
        }

        //4. Выведи найденную строку на экран.
        for (int i = 0; i < sizeOflistFromKeyboard; i++){
            String stringItem = listFromKeyboard.get(i);
            if (stringItem.length() == minLen){
                System.out.println(stringItem);
            }
        }

    }
}
