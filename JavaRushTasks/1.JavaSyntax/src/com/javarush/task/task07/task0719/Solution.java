package com.javarush.task.task07.task0719;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
    Вывести числа в обратном порядке
    Ввести с клавиатуры 10 чисел и заполнить ими список.
    Вывести их в обратном порядке. Каждый элемент - с новой строки.
    Использовать только цикл for.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //напишите тут ваш код
        //Ввести с клавиатуры 10 чисел и заполнить ими список.
        ArrayList<Integer> listFromKeyboard = new ArrayList<>();
        int listSize = 10;
        for(int i = 0; i < listSize; i++){
            int nNum = Integer.parseInt(reader.readLine());
            listFromKeyboard.add(nNum);
        }
        //Вывести их в обратном порядке. Каждый элемент - с новой строки.
        for(int i = 0; i < listSize; i++){
            int nNum = listFromKeyboard.get(listSize-1-i);
            System.out.println(nNum);
        }





    }
}
