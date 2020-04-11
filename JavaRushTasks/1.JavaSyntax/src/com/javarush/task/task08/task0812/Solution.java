package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* 
Cамая длинная последовательность
    1. Создай список чисел.
    2. Добавь в список 10 чисел с клавиатуры.
    3. Вывести на экран длину самой длинной последовательности повторяющихся чисел в списке.
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> numbers = new ArrayList<Integer>();

        for(int i = 0; i < 10; i++){
            numbers.add(Integer.parseInt(reader.readLine()));
        }

        int maxSize = 0;
        int counter = 1;    //минимальная длина счётчика = 1
        for (int i = 1; i < 10; i++){
            int previous = numbers.get(i-1);
            int current = numbers.get(i);
            if (current == previous)    counter++;
            if (maxSize < counter)      maxSize = counter;
            if (current != previous)    counter = 1;
        }



        System.out.println(maxSize);


    }
}