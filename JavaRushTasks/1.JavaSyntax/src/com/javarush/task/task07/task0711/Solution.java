package com.javarush.task.task07.task0711;

/* 
Удалить и вставить
    1. Создай список строк.
    2. Добавь в него 5 строк с клавиатуры.
    3. Выполни 13 раз: удалить последнюю строку и вставить её в начало.
4. Используя цикл выведи содержимое результирующего списка на экран, каждое значение с новой строки.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        //1. Создай список строк.
        //2. Добавь в него 5 строк с клавиатуры.
        ArrayList<String> listFromKeyboard = new ArrayList<>();
        int listSize = 5;
        for(int i = 0; i < listSize; i++){
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String sItem = reader.readLine();
            listFromKeyboard.add(sItem);
        }

        //3. Выполни 13 раз: удалить последнюю строку и вставить её в начало.
        int counter = 13 % listSize;
        for(int i = 0; i < counter; i++){
            listFromKeyboard.add(0, listFromKeyboard.get(listSize-1));
            listFromKeyboard.remove(listSize);
        }

        //4. Используя цикл выведи содержимое результирующего списка на экран, каждое значение с новой строки.
        for(int i = 0; i < listSize; i++){
            System.out.println(listFromKeyboard.get(i));
        }

    }
}
