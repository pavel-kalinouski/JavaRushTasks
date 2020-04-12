package com.javarush.task.task08.task0813;

import java.util.HashSet;
import java.util.Set;

/* 
20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву "Л".
    1. Не изменяй заголовок метода createSet().
    2. Программа не должна выводить текст на экран.
    3. Программа не должна считывать значения с клавиатуры.
    4. Метод createSet() должен создавать и возвращать множество (реализация HashSet).
    5. Множество из метода createSet() должно содержать 20 слов на букву «Л».
*/

public class Solution {
    public static Set<String> createSet() {
        //напишите тут ваш код

        Set<String> strings = new HashSet<String>();
        strings.add("Лимон1");
        strings.add("Лимон2");
        strings.add("Лимон3");
        strings.add("Лимон4");
        strings.add("Лимон5");
        strings.add("Лимон6");
        strings.add("Лимон7");
        strings.add("Лимон8");
        strings.add("Лимон9");
        strings.add("Лимон10");
        strings.add("Лимон11");
        strings.add("Лимон12");
        strings.add("Лимон13");
        strings.add("Лимон14");
        strings.add("Лимон15");
        strings.add("Лимон16");
        strings.add("Лимон17");
        strings.add("Лимон18");
        strings.add("Лимон19");
        strings.add("Лимон20");



        return strings;
    }

    public static void main(String[] args) {
        createSet();
    }
}
