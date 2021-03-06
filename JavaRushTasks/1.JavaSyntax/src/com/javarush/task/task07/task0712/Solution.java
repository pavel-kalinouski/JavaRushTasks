package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
    1. Создай список строк.
    2. Добавь в него 10 строчек с клавиатуры.
    3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
    Если таких строк несколько, то должны быть учтены самые первые из них.
    4. Выведи на экран строку из п.3. Должна быть выведена одна строка.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        //1. Создай список строк.
        //2. Добавь в него 10 строчек с клавиатуры.
        ArrayList<String> listFromKeyboard = new ArrayList<>();
        int listSize = 10;
        int theShortestString = Integer.MAX_VALUE;
        int theLongestString = Integer.MIN_VALUE;
        for(int i = 0; i < listSize; i++ ){
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String sItem = reader.readLine();
            listFromKeyboard.add(sItem);
            int sItemLength = sItem.length();
            if (sItemLength < theShortestString){
                theShortestString = sItemLength;
            }
            if (sItemLength > theLongestString){
                theLongestString = sItemLength;
            }
        }

        //4. Выведи на экран строку из п.3. Должна быть выведена одна строка.
        for(int i  = 0; i < listSize; i++){
            String sItem = listFromKeyboard.get(i);
            int sItemLength = sItem.length();
            if (sItemLength == theLongestString || sItemLength == theShortestString){
                System.out.println(sItem);
                break;
            }
        }



    }
}
