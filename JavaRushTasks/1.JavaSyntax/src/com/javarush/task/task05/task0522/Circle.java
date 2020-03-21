package com.javarush.task.task05.task0522;

/* 
Максимум конструкторов
*/

public class Circle {
    public double x;
    public double y;
    public double radius;

    public Circle(){
        System.out.println("default constructor");
    }
    public Circle(double x){
        this();
        this.x = x;
    }
    public Circle(double x, double y){
        this(x);
        this.y = y;
    }
    public Circle(double x, double y, double radius){
        this(x,y);
        this.radius = radius;
    }

    //напишите тут ваш код

    public static void main(String[] args) {

    }
}