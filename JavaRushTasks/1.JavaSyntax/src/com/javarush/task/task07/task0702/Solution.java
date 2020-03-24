package com.javarush.task.task07.task0702;
import java.io.*;

/* 
Массив из строчек в обратном порядке
    1. Создать массив на 10 строк.
    2. Ввести с клавиатуры 8 строк и сохранить их в массив.
3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int arrayLength = 10;
        int numbersAmountToEnter = 8;
        String[] sArray = arrayInitialize(arrayLength, numbersAmountToEnter);
        printArrayDESC(sArray);
    }


    //create array for N numbers & enter M
    public static String[] arrayInitialize(int arrayLength, int numbersAmountToEnter) throws IOException{
        String[] sArray = new String[arrayLength];
        for(int i = 0; i < numbersAmountToEnter; i++){
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            sArray[i] = reader.readLine();
        }

        return sArray;
    }

    public static void printArrayDESC(String[] sArray){
        int arrayLength = sArray.length;
        for(int i = 1; i <= arrayLength; i++){
            System.out.println(sArray[arrayLength-i]);
        }
    }
}