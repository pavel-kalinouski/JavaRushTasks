package com.javarush.task.task07.task0707;

/* 
Что за список такой?
    1. Создай список строк.
    2. Добавь в него 5 различных строк.
    3. Выведи его размер на экран.
    4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception{
        //напишите тут ваш код
        //1. Создай список строк.
        ArrayList<String> sArrayList = new ArrayList<>();

        //2. Добавь в него 5 различных строк.
        for(int i = 0; i < 5; i++){
            sArrayList.add(i, "test");
        }

        //3. Выведи его размер на экран.
        System.out.println(sArrayList.size());

        //4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
        for(int i = 0; i < 5; i++){
            System.out.println(sArrayList.get(i));
        }


    }
}
