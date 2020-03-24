package com.javarush.task.task07.task0703;

/* 
    Общение одиноких массивов
    1. Создать массив на 10 строк.
    2. Создать массив на 10 чисел.
    3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
    4. В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.
    Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //create string and int array
        int arrayLength = 10;
        int[] lenArray = new int[10];
        String[] sArray = new String[10];

        //write the data in arrays
        for(int i = 0; i < arrayLength; i++){
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            //write String to sArray
            sArray[i] = reader.readLine();
            //write String.length to lenArray
            lenArray[i] = sArray[i].length();
        }

        //print the numArray
        for(int i = 0; i < arrayLength; i++){
            System.out.println(lenArray[i]);
        }

    }


}
