package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
    Только для богачей
    Создать словарь (Map<String, Integer>) и занести в него десять записей по принципу: "фамилия" - "зарплата".
    Удалить из словаря всех людей, у которых зарплата ниже 500.
    Требования:
    1. Программа не должна выводить текст на экран.
    2. Программа не должна считывать значения с клавиатуры.
    3. Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, Integer состоящих из 10 записей по принципу «фамилия» - «зарплата».
4. Метод removeItemFromMap() должен удалять из словаря всех людей, у которых зарплата ниже 500.
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        Map<String, Integer> peopleSalaries = new HashMap<>();
        peopleSalaries.put("Калиновский",2700);
        peopleSalaries.put("Данцевич",0);
        peopleSalaries.put("Test1",30000);
        peopleSalaries.put("Test2",500);
        peopleSalaries.put("Test3",490);
        peopleSalaries.put("Test4",1000);
        peopleSalaries.put("Test5",-50);
        peopleSalaries.put("Test6",600);
        peopleSalaries.put("Test7",799);
        peopleSalaries.put("Test8",400);

        return peopleSalaries;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Integer> entry = iterator.next();
            String name = entry.getKey();
            Integer salary = entry.getValue();
            if (salary < 500){
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {
        Map<String, Integer> map = createMap();
        removeItemFromMap(map);
    }
}