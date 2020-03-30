package com.javarush.task.task07.task0714;

/* 
Слова в обратном порядке
    Введи с клавиатуры 5 слов в список строк.
    Удали 3 - ий элемент списка,
и выведи оставшиеся элементы в обратном порядке.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        //Введи с клавиатуры 5 слов в список строк
        ArrayList<String> listFromKeyboard = new ArrayList<>();
        int listSize = 5;
        for (int i = 0; i < listSize; i++){
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String sItem = reader.readLine();
            listFromKeyboard.add(sItem);
        }
        //Удали 3 - ий элемент списка,
        listFromKeyboard.remove(2);
        //и выведи оставшиеся элементы в обратном порядке.
        Collections.reverse(listFromKeyboard);
        for(String string : listFromKeyboard) System.out.println(string);
    }
}
