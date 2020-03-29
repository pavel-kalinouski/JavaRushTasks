package com.javarush.task.task07.task0710;

/*
В начало списка
1. Создай список строк в методе main.
2. Добавь в него 10 строчек с клавиатуры, но только добавлять не в конец списка, а в начало.
3. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        //1. Создай список строк в методе main.
        //2. Добавь в него 10 строчек с клавиатуры, но только добавлять не в конец списка, а в начало.
        ArrayList<String> listFromKeyboard = new ArrayList<>();
        int listSize = 10;
        for(int i = 0; i < listSize; i++){
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            listFromKeyboard.add(0, reader.readLine());
        }
        //3. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
        for(int i = 0; i < listSize; i++){
            System.out.println(listFromKeyboard.get(i));
        }

    }
}
