package com.javarush.task.task05.task0520;

/* 
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (верхняя координата, левая, ширина и высота).
Создать для него как можно больше методов конструкторов.
Примеры:
- заданы 4 параметра: left, top, width, height
- ширина/высота не задана (оба равны 0)
- высота не задана (равно ширине) создаём квадрат
- создаём копию другого прямоугольника (он и передаётся в параметрах)
*/


public class Rectangle {
    //variables
    int left, top, width, height;

    //заданы 4 параметра: left, top, width, height
    public Rectangle(int left, int top, int width, int height){
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }
    //ширина/высота не задана (оба равны 0)
    public Rectangle(int left, int top){
        this.left = left;
        this.top = top;
        this.width = 0;
        this.height = 0;
    }
    //высота не задана (равно ширине) создаём квадрат
    public Rectangle(int left, int top, int width){
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = width;
    }
    //создаём копию другого прямоугольника (он и передаётся в параметрах)
    public Rectangle(Rectangle other){
        this.left = other.left;
        this.top = other.top;
        this.width = other.width;
        this.height = other.height;
    }


    public static void main(String[] args) {

    }
}
