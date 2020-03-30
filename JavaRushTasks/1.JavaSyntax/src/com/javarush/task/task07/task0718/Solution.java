package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
    1. Введи с клавиатуры 10 слов в список строк.
    2. Определить, является ли список упорядоченным по возрастанию длины строки.
3. В случае отрицательного ответа вывести на экран индекс первого элемента, нарушающего такую упорядоченность.
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<String> listFromKeyboard = new ArrayList<>();
        int listSize = 10;
        for(int i = 0; i < listSize; i++){
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String sItem = reader.readLine();
            listFromKeyboard.add(sItem);
        }

        //2. Определить, является ли список упорядоченным по возрастанию длины строки.
        int lengthValueToCompare = 0;
        for(String string : listFromKeyboard){
            int sLen = string.length();
            if (sLen >= lengthValueToCompare ){
                lengthValueToCompare = sLen;
            }
            else {
                System.out.println(listFromKeyboard.indexOf(string));
                break;
            }
        }

    }
}

