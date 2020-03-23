package com.javarush.task.task06.task0622;

import java.io.*;


/* 
Числа по возрастанию
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
*/

public class Solution {
    //variables
    public static int arrayLength = 5;
    public static int[] numArray = new int[5]; //объявление массива целых чисел + создание объекта с количестом айтемов = 5


    public static void main(String[] args) throws Exception {


        enterNumArray();
        sortNumbersASC();
        printNumArray();

    }
        //so

    //Create method for input numbers
    private static void enterNumArray() throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < arrayLength; i++){
            int numberFromConsole = Integer.parseInt(reader.readLine());
            numArray[i] = numberFromConsole;
        }
    }
    //Create method to sort the array (bubble sort)
    public static void sortNumbersASC(){
        for (int i = 0; i < arrayLength - 1; i++){
            for (int j = 0; j < arrayLength - i - 1; j++)
                if (numArray[j] > numArray[j+1]){
                    //swap items
                    int temp = numArray[j];
                    numArray[j] = numArray[j + 1];
                    numArray[j + 1] = temp;
                }
        }
    }
    //Print the arrey
    public static void printNumArray(){
        for (int i = 0; i < arrayLength; i++){
            System.out.println(numArray[i]);
        }
    }

}



