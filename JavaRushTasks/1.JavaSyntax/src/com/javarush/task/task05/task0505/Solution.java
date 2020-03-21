package com.javarush.task.task05.task0505;

/* 
Кошачья бойня
*/

public class Solution {

    public static void main(String[] args) {
        //напишите тут ваш код
        Cat monika = new Cat("monika", 2,3,5);
        Cat markiza = new Cat("markiza", 7,4,5);
        Cat iriska = new Cat("iriska", 2,3,7);

        System.out.println("Monika wins: " + monika.fight(iriska));
        System.out.println("markiza wins: " + markiza.fight(iriska));
        System.out.println("Monika wins: " + monika.fight(markiza));
    }

    public static class Cat {

        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int ageScore = Integer.compare(this.age, anotherCat.age);
            int weightScore = Integer.compare(this.weight, anotherCat.weight);
            int strengthScore = Integer.compare(this.strength, anotherCat.strength);

            int score = ageScore + weightScore + strengthScore;
            return score > 0; // return score > 0 ? true : false;
        }
    }
}
