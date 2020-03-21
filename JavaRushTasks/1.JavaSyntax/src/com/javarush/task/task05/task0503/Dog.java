package com.javarush.task.task05.task0503;


/* 
Геттеры и сеттеры для класса Dog
*/

import java.sql.SQLOutput;

public class Dog {
    //напишите тут ваш код
    String name;
    int age;

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public static void main(String[] args) {
        Dog barsik = new Dog();
        barsik.setName("Baarsik");
        System.out.println(barsik.getName());
        barsik.setAge(3);
        System.out.println(barsik.getAge());
    }
}
