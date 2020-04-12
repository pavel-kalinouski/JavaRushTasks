package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
    Перепись населения
    Создать словарь (Map<String, String>) занести в него десять записей по принципу "Фамилия" - "Имя".
    Проверить сколько людей имеют совпадающие с заданным именем или фамилией.
    1. Программа не должна выводить текст на экран.
    2. Программа не должна считывать значения с клавиатуры.
    3. Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, String состоящих из 10 записей по принципу «Фамилия» - «Имя».
    4. Метод getCountTheSameFirstName() должен возвращать число людей у которых совпадает имя.
    5. Метод getCountTheSameLastName() должен возвращать число людей у которых совпадает фамилия.
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> persons = new HashMap<>();
        persons.put("Калиновский", "Павел");
        persons.put("Калиновская", "Галина");
        persons.put("Киселев", "Евгений");
        persons.put("Ставская", "Екатерина");
        persons.put("Новицкий", "Андрей");
        persons.put("Данцевич", "Иван");
        persons.put("Корчик", "Елизавета");
        persons.put("Горькова", "Светлана");
        persons.put("Михальчук", "Ольга");
        persons.put("Сергеенко", "Иван");

        return  persons;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код
        int counter = 0;
        Iterator<String> iterator = map.values().iterator();
        while (iterator.hasNext()){
            String temp = iterator.next();
            if (temp.equals(name)) counter++;
        }
        //System.out.println(counter);
        return counter;

    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код
        int counter = 0;
        Iterator<String> iterator = map.keySet().iterator();
        while (iterator.hasNext()){
            String temp = iterator.next();
            if (temp.equals(lastName)) counter++;
        }
        //System.out.println(counter);
        return counter;

    }

    public static void main(String[] args) {
        Map<String, String> persons = createMap();
        getCountTheSameFirstName(persons,"Иван");
        getCountTheSameLastName(persons,"Новицкий");
    }
}
