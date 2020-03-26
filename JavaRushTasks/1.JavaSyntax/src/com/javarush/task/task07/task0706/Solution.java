package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
    1. Создать массив на 15 целых чисел.
    2. Ввести в него значения с клавиатуры.
    3. Пускай индекс элемента массива является номером дома, а значение - числом жителей, проживающих в доме.
    Дома с нечетными номерами расположены на одной стороне улицы, с четными - на другой. Выяснить, на какой стороне улицы проживает больше жителей.
4. Вывести на экран сообщение: "В домах с нечетными номерами проживает больше жителей." или "В домах с четными номерами проживает больше жителей."

Примечание:
дом с порядковым номером 0 считать четным.

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        int[] nArray = new int[15];
        int arrayLen = nArray.length;
        int even = 0;
        int odd = 0;

        for(int i = 0; i < arrayLen; i++ ){
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            nArray[i] = Integer.parseInt(reader.readLine());
            if (i % 2 == 0){
                even += nArray[i];
            }
            else if (i % 2 != 0){
                odd += nArray[i];
            }
        }

        if (even > odd){
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }
        else if (even < odd){
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }

    }
}
