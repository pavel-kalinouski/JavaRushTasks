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
        Human child2 = new Human("Арсений", true, 7);
        Human child3 = new Human("Марго", false, 5);
        ArrayList<Human> children1 = new ArrayList<Human>(Arrays.asList(child1, child2, child3));


        Human mother = new Human("мать", false, 31, children1);
        Human father = new Human("отец", true, 32, children1);
        ArrayList<Human> children2 = new ArrayList<Human>(Arrays.asList(mother));
        ArrayList<Human> children3 = new ArrayList<Human>(Arrays.asList(father));

        Human grandfather2 = new Human("Дед2", true, 70, children2);
        Human grandmother2 = new Human("Бабка2", false, 71, children2);
        Human grandfather1 = new Human("Дед1", true, 68, children3);
        Human grandmother1 = new Human("Бабка1", false, 69, children3);

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
            this.children = new ArrayList<Human>();
            System.out.println(this.toString());
        }

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
            System.out.println(this.toString());
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
