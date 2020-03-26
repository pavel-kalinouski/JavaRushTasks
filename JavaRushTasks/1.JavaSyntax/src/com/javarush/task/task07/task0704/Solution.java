package com.javarush.task.task07.task0704;
import java.io.*;

/* 
Переверни массив
    1. Создать массив на 10 чисел.
    2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Вывести на экран элементы массива в обратном порядке, каждое значение выводить с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] array = new int[10];

        //enter the array
        int arrayLen = array.length;
        for(int i = 0; i < arrayLen; i++){
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            array[i] = Integer.parseInt(reader.readLine());
        }

        //print the array in DESC order
        for(int i = 0; i < arrayLen; i++){
            System.out.println(array[arrayLen-1-i]);
        }
    }
}

