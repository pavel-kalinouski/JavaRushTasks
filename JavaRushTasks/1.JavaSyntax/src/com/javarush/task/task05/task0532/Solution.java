package com.javarush.task.task05.task0532;
import java.io.*;
import java.util.Arrays;
/* 
Задача по алгоритмам
Написать программу, которая:
1. считывает с консоли число N, которое должно быть больше 0
2. потом считывает N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
- проверка условия
- тестирование
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = Integer.parseInt(reader.readLine());

        //считать N чисел с консоли и записать их в массив

        if (maximum > 0) {
            int[] numbersArray = new int[maximum];
            for (int i = 0; i < maximum; i++) {
                numbersArray[i] = Integer.parseInt(reader.readLine());
            }

            //сортировка массива и вывод максимального
            Arrays.sort(numbersArray);
            System.out.println(numbersArray[maximum - 1]);
        }
    }
}
