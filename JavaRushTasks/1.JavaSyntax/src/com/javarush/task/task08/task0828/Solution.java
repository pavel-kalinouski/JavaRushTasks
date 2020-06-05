package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

/* 
    Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: "May is the 5 month".
Используйте коллекции.

    Требования:
    1. Программа должна считывать одно значение с клавиатуры.
    2. Программа должна выводить текст на экран.
3. Программа должна использовать коллекции.
    4. Программа должна считывать с клавиатуры имя месяца и выводить его номер на экран по заданному шаблону.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String monthName = reader.readLine();

        Map<String, Integer> map = new HashMap<>();
        map.put("January", Calendar.JANUARY + 1);
        map.put("February", Calendar.FEBRUARY + 1);
        map.put("March", Calendar.MARCH + 1);
        map.put("April", Calendar.APRIL + 1);
        map.put("May", Calendar.MAY + 1);
        map.put("June", Calendar.JUNE  + 1);
        map.put("July", Calendar.JULY + 1);
        map.put("August", Calendar.AUGUST + 1);
        map.put("September", Calendar.SEPTEMBER  + 1);
        map.put("October", Calendar.OCTOBER + 1);
        map.put("November", Calendar.NOVEMBER + 1);
        map.put("December", Calendar.DECEMBER + 1);

        Integer number = map.get(monthName);

        System.out.println(monthName + " is the " + number + " month");
    }
}
