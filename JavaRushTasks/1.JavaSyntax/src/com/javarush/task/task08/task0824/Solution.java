package com.javarush.task.task08.task0824;

/* 
    Собираем семейство
    1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
    2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Выведи все объекты Human на экран (Подсказка: используй метод toString() класса Human).
    Требования:
    1. Программа должна выводить текст на экран.
    2. Класс Human должен содержать четыре поля.
    3. Класс Human должен содержать один метод.
    4. Класс Solution должен содержать один метод.
5. Программа должна создавать объекты и заполнять их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей и выводить все объекты Human на экран.
*/

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

        Human child1 = new Human("Стёпа", true, 11);
        child1.children = new ArrayList<Human>();
        System.out.println(child1.toString());
        Human child2 = new Human("Арсений", true, 7);
        child2.children = new ArrayList<Human>();
        System.out.println(child2.toString());
        Human child3 = new Human("Марго", false, 5);
        child3.children = new ArrayList<Human>();
        System.out.println(child3.toString());


        Human mother = new Human("мать", false, 31);
        mother.children = new ArrayList<Human>(Arrays.asList(child1, child2, child3));
        System.out.println(mother.toString());

        Human father = new Human("отец", true, 32);
        father.children = new ArrayList<Human>(Arrays.asList(child1, child2, child3));
        System.out.println(father.toString());

        Human grandfather2 = new Human("Дед2", true, 70);
        grandfather2.children = new ArrayList<Human>(Arrays.asList(mother));
        System.out.println(grandfather2.toString());
        Human grandmother2 = new Human("Бабка2", false, 71);
        grandmother2.children = new ArrayList<Human>(Arrays.asList(mother));
        System.out.println(grandmother2.toString());

        Human grandfather1 = new Human("Дед1", true, 68);
        grandfather1.children = new ArrayList<Human>(Arrays.asList(father));
        System.out.println(grandfather1.toString());
        Human grandmother1 = new Human("Бабка1", false, 69);
        grandmother1.children = new ArrayList<Human>(Arrays.asList(father));
        System.out.println(grandmother1.toString());

    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
