package com.javarush.task.task06.task0612;

/* 
Калькулятор
Сделать класс Calculator, у которого будут 5 статических методов:
int plus(int a, int b) - возвращает сумму чисел a и b
int minus(int a, int b) - возвращает разницу чисел a и b
int multiply(int a, int b) - возвращает результат умножения числа a на число b
double division(int a, int b) - возвращает результат деления числа a на число b
double percent(int a, int b) - возвращает b процентов от числа a (например, percent(4, 50) должен вернуть 50% от 4)
- условие
- протестировать
*/

public class Calculator {
    public static int plus(int a, int b) {
        int result = a + b;
        return result;
    }

    public static int minus(int a, int b) {
        int result = a - b;
        return result;
    }

    public static int multiply(int a, int b) {
        int result = a * b;
        return result;
    }

    public static double division(int a, int b) {
        double result = (double) a / b;
        return result;
    }

    public static double percent(int a, int b) {
        double result = (double) a * b / 100 ;
        return result;
    }

    public static void main(String[] args) {

    }
}