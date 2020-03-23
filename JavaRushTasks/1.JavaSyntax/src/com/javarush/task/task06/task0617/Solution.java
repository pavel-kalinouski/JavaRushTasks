package com.javarush.task.task06.task0617;

/* 
    Блокнот для новых идей
    1. В классе Solution создать public static класс Idea.
    2. В классе Idea создать метод public String getDescription(), который будет возвращать любую строку.
    3. В классе Solution создай статический метод public void printIdea(Idea idea), который будет выводить
     на экран описание идеи - это то, что возвращает метод getDescription().
*/

public class Solution {
    public static void main(String[] args) {
        printIdea(new Idea());
    }

    public static class Idea{
        //non-static Idea mehtod
        public String getDescription(){
            String idea = "test idea";
            return idea;
        }
    }

    //static method to print
    public static void printIdea(Idea idea){
        //на вход этому методу передаётся объект класса Idea -> используется нестатический метод для взаимодействия с этим объектом
        System.out.println(idea.getDescription());

    }
}
