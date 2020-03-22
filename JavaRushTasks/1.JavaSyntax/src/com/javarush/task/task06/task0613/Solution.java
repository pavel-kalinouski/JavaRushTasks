package com.javarush.task.task06.task0613;

/* 
Кот и статика
    В классе Cat создай статическую переменную public int catCount.
    Создай конструктор [public Cat()]. Пусть при каждом создании кота (нового объекта Cat)
    статическая переменная catCount увеличивается на 1. Создать 10 объектов Cat и вывести значение переменной catCount на экран.
    - протестировать
- условие
*/

public class Solution {
    public static void main(String[] args) {
        // Создай 10 котов
        int timesToCreateCats = 10;
        for (int i = 0; i < timesToCreateCats; i++){
            Cat cat1 = new Cat();
        }
        // Выведи значение переменной catCount
        System.out.println(Cat.catCount);
    }

    public static class Cat {
        // Создай статическую переменную catCount
        public static int catCount = 0;
        // Создай конструктор
        public Cat(){
            catCount++;
        }
    }
}
