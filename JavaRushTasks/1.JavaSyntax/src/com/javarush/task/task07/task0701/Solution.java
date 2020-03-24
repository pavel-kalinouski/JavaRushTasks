package com.javarush.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Массивный максимум
    1. В методе initializeArray():
    1.1. Создайте массив на 20 чисел
    1.2. Считайте с консоли 20 чисел и заполните ими массив
    2. Метод max(int[] array) должен находить максимальное число из элементов массива
- протестировать
    - условие
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        // создай и заполни массив
        int arrayLength = 20;
        int[] array = new int[arrayLength];

        for(int i = 0; i < arrayLength; i++){
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            array[i] = Integer.parseInt(reader.readLine());
        }
        return array;
    }

    public static int max(int[] array) {
        // найди максимальное значение
        int arrayLength = array.length;
        int max = array[0];

        for(int i = 0; i < arrayLength; i++){
            if (array[i] > max){
                max = array[i];
            }
        }
        return max;
    }
}
