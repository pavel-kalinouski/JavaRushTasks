package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
    Добрая Зинаида и летние каникулы
    Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: "фамилия" - "дата рождения".
    Удалить из словаря всех людей, родившихся летом.
    Требования:
    1. Программа не должна выводить текст на экран.
    2. Программа не должна считывать значения с клавиатуры.
    3. Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String, Date состоящий из 10 записей.
4. Метод removeAllSummerPeople() должен удалять из словаря всех людей, родившихся летом.
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));
        map.put("Калиновский", dateFormat.parse("JULY 17 1991"));
        map.put("Данцевич", dateFormat.parse("JANUARY 11 1997"));
        map.put("Горькова", dateFormat.parse("MAY 9 1985"));
        map.put("Калинаускас", dateFormat.parse("JANUARY 2 1951"));
        map.put("Калиновская", dateFormat.parse("MARCH 1 1949"));
        map.put("Арина", dateFormat.parse("APRIL 1 2014"));
        map.put("Test 1", dateFormat.parse("SEPTEMBER 1 2004"));
        map.put("Test 2", dateFormat.parse("AUGUST 3 2001"));
        map.put("Test 3", dateFormat.parse("AUGUST 1 1991"));

        return map;
    }


    public static void removeAllSummerPeople(Map<String, Date> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();

        while(iterator.hasNext()){
            Map.Entry<String, Date> entry = iterator.next();
            String key = entry.getKey();
            Date value = entry.getValue();
            if (value.getMonth() >= 5 && value.getMonth() <= 7){
                iterator.remove();
            }

        }

    }

    public static void main(String[] args) throws ParseException{
        Map<String, Date> map = createMap();
        removeAllSummerPeople(map);
    }
}
