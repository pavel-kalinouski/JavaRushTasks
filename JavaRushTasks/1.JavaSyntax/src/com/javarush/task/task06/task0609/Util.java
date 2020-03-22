package com.javarush.task.task06.task0609;

/* 
    Расстояние между двумя точками
    Реализовать статический метод double getDistance(x1, y1, x2, y2). Он должен вычислять расстояние между точками.
    Используй метод double Math.sqrt(double a), который вычисляет квадратный корень переданного параметра.
    - проверить условие
- протестировать задачу
*/

public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(   Math.pow((x1 - x2),2) + Math.pow((y1 - y2),2));
    }

    public static void main(String[] args) {

    }
}
