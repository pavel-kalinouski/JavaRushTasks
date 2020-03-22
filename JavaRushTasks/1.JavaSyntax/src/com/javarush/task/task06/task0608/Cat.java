package com.javarush.task.task06.task0608;

/* 
    Статические методы для кошек
    Добавить к классу Cat два статических метода: int getCatCount() и setCatCount(int),
    с помощью которых можно получить/изменить количество котов (переменную catCount).
*/

public class Cat {
    //static variable - едина для все класса, независимо от того, сколько существует объектов и созданы-ли они
    private static int catCount = 0;

    public Cat() {
        catCount++;
    }

    //static метод работает исключительн с static переменными. Доступа к переменным объектов у него нет, т.к. ссылка на объект внутрь не передается
    public static int getCatCount() {
        return catCount;

    }

    //для взаимодействия с static class variable используется формат class_name.variable_name
    public static void setCatCount(int catCount) {
        Cat.catCount = catCount;


    }

    public static void main(String[] args) {

    }
}
