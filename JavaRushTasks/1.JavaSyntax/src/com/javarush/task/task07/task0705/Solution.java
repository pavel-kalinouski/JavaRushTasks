package com.javarush.task.task07.task0705;
import java.io.*;

/* 
    Один большой массив и два маленьких
    1. Создать массив на 20 чисел.
    2. Ввести в него значения с клавиатуры.
    3. Создать два массива на 10 чисел каждый.
    4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        //create numArray for 20 days
        int[] numArray = new int[20];
        //create two arrays for 10 numbers
        int[] firstArray = new int[10];
        int[] secondArray = new int[10];

        //enter numbers in numArray:
        int arrayLength = numArray.length;
        for (int i = 0; i < arrayLength; i++) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            numArray[i] = Integer.parseInt(reader.readLine());
            //fill one of two additional arrays
            if (i < arrayLength / 2) {
                firstArray[i] = numArray[i];
            } else if (i >= arrayLength / 2) {
                secondArray[i - arrayLength / 2] = numArray[i];
            }


        }

        //print the second array
        for (int i = 0; i < arrayLength / 2; i++) {
            System.out.println(secondArray[i]);
        }
    }
}