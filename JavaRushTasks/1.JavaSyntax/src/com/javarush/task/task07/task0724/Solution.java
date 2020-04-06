package com.javarush.task.task07.task0724;

/* 
Семейная перепись
Создай класс Human с полями
    имя(String),
    пол(boolean),
    возраст(int),
    отец(Human),
    мать(Human).
    Создай объекты и заполни их так, чтобы получилось:
    Два дедушки,
    две бабушки,
    отец,
    мать,
    трое детей.
Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.

*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        ArrayList<Human> familyList = new ArrayList<>();

        Human grandFatherOne = new Human("Pavel", true, 69);
        Human grandFatherTwo = new Human("Sema", true, 79);
        Human grandMotherOne = new Human("Nina", false, 65);
        Human grandMotherTwo = new Human("Valya", false, 67);
        Human father = new Human("Semen", true, 69, grandMotherOne, grandFatherOne);
        Human mother = new Human("Galina", false, 71, grandMotherTwo, grandFatherTwo);
        Human childOne = new Human("Sveta", false, 45, mother, father);
        Human childtwo = new Human("Pavel", true, 29, mother, father);
        Human childThree = new Human("Petya", true, 16, mother, father);
        familyList.add(grandFatherOne);
        familyList.add(grandFatherTwo);
        familyList.add(grandMotherOne);
        familyList.add(grandMotherTwo);
        familyList.add(father);
        familyList.add(mother);
        familyList.add(childOne);
        familyList.add(childtwo);
        familyList.add(childThree);

        for(Human fam : familyList) System.out.println(fam);
    }

    public static class Human {
        // напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human mother, Human father){
            this(name, sex, age);
            this.father = father;
            this.mother = mother;
        }


        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}