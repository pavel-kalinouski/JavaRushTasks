package com.javarush.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удваиваем слова
    1. Введи с клавиатуры 10 слов в список строк.
    2. Метод doubleValues должен удваивать слова по принципу:
"альфа", "бета", "гамма" -> "альфа", "альфа", "бета", "бета", "гамма", "гамма"
3. Выведи результат на экран, каждое значение с новой стр
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // Считать строки с консоли и объявить ArrayList list тут
        ArrayList<String> listFromKeyboard = new ArrayList<>();
        int listSize = 10;
        for(int i = 0; i < listSize; i++){
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String string = reader.readLine();
            listFromKeyboard.add(string);
        }


        ArrayList<String> result = doubleValues(listFromKeyboard);

        // Вывести на экран result
        for(String string : result) System.out.println(string);
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        //напишите тут ваш код
        ArrayList<String> result = new ArrayList<>();
        int listSize = list.size();
        for (String string : list){
            result.add(string);
            result.add(string);
        }
        return result;
    }
}
