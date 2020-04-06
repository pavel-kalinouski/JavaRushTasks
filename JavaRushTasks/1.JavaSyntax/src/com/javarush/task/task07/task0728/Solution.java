package com.javarush.task.task07.task0728;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
В убывающем порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {
        //напишите тут ваш код
        //сортирова вставками
        int arraySize =  array.length;
        //перебираем весь массив и делим его на sorted & unsorted части
        for(int i = 0; i < arraySize; i++){
            //вкидываем в temp текущий прорабатываемый элемент (i)
            int element = array[i];
            int j = i;
            //сравниваем элемент с всем отсортированным массивом
            while(j > 0 && array[j-1] < element){
                // текущий жлемент переписывает на предыдущий и понижает счётчик
                array[j] = array[j-1];
                j = j - 1;
            }
            // в образовавшееся место записывает искомый элемент
            array[j] = element;
        }
    }
}
