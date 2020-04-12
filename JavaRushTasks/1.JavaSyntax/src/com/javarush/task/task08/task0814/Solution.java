package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
    1. Программа не должна выводить текст на экран.
    2. Программа не должна считывать значения с клавиатуры.
    3. Класс Solution должен содержать только три метода.
    4. Метод createSet() должен создавать и возвращать множество Set состоящих из 20 различных чисел.
5. Метод removeAllNumbersGreaterThan10() должен удалять из множества все числа больше 10.
*/

public class Solution {
    public static Set<Integer> createSet() {
        // напишите тут ваш код
        Set<Integer> numbers = new HashSet<Integer>();
        for (int i = 0; i < 20; i++){
            numbers.add(i);
        }
        return numbers;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        // напишите тут ваш код
        /*
        Вижу пару вариантов:
        - создать второй сет, скопировать туда элементы 0 - 10, удалить все элементы первого и закинуть потом элементы из второго
        - итерационно просканить каждый элемент и проанализировать его на условие и удалить, если нуэно
         */
        Iterator<Integer> iterator = set.iterator();

        while (iterator.hasNext()){
            int temp = iterator.next();
            if (temp > 10) iterator.remove();
        }

        return set;

    }

    public static void main(String[] args) {
        Set<Integer> nums = createSet();
        removeAllNumbersGreaterThan10(nums);
    }
}
