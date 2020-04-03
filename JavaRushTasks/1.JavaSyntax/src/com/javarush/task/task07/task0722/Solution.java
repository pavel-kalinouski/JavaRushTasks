package com.javarush.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Это конец
Создать список строк.
Ввести строки с клавиатуры и добавить их в список.
Вводить с клавиатуры строки, пока пользователь не введет строку "end". Саму строку "end" не учитывать.
Вывести строки на экран, каждую с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //Создать список строк.
        //Ввести строки с клавиатуры и добавить их в список.
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> listFromKeyboard = new ArrayList<>();
        while (true){
            String sItem = reader.readLine();
            if (sItem.equals("end")) break;
            listFromKeyboard.add(sItem);
        }

        for (String sItem : listFromKeyboard) System.out.println(sItem);
    }
}