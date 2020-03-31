package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/* 
Минимаксы в массивах
Создать массив на 20 чисел.
Заполнить его числами с клавиатуры.
Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum;
        int minimum;

        //напишите тут ваш код
        //Создать массив на 20 чисел.
        //Заполнить его числами с клавиатуры.
        int[] numbersArray = new int[20];
        int arraySize = 20;
        for(int i = 0; i < arraySize; i++){
            int nNum = Integer.parseInt(reader.readLine());
            numbersArray[i] = nNum;
        }

        //Найти максимальное и минимальное числа в массиве.
        Arrays.sort(numbersArray);
        minimum = numbersArray[0];
        maximum = numbersArray[arraySize-1];

        //Вывести на экран максимальное и минимальное числа через пробел.
        System.out.print(maximum + " " + minimum);
    }
}
