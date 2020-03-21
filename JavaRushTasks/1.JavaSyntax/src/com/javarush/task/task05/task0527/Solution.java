package com.javarush.task.task05.task0527;

/* 
    Том и Джерри
    Создай классы Dog, Cat, Mouse.
    Добавь по три поля в каждый класс, на твой выбор.
    Создай объекты для героев мультика Том и Джерри.
    Так много, как только вспомнишь.
Перепроверь условие
*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        Cat tomCat = new Cat("Tom", 7, "gray");
        Dog barsikDog = new Dog("Barsik", 99, 150);

        //напишите тут ваш код
    }

    //Создай классы Dog, Cat, Mouse.
    //Добавь по три поля в каждый класс, на твой выбор
    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }
    public static class Cat {
        String name;
        int weight;
        String color;

        public Cat(String name, int weight, String color) {
            this.name = name;
            this.weight = weight;
            this.color = color;
        }
    }
    public static class Dog {
        String name;
        int strength;
        int noize;

        public Dog(String name, int strength, int noize) {
            this.name = name;
            this.strength = strength;
            this.noize = noize;
        }
    }


    //напишите тут ваш код
}
