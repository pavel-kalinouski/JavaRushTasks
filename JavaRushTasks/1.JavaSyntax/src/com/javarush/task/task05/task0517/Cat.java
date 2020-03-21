package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
Создать класс Cat (кот) с пятью конструкторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст - неизвестные. Кот - бездомный)
- вес, цвет, адрес (чужой домашний кот)
Задача конструктора - сделать объект валидным.
Например, если вес не известен, то нужно указать какой-нибудь средний вес.
Кот не может ничего не весить.
То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat {
    //напишите тут ваш код
    String name;
    int age;
    int weight;
    String color;
    String address;

    //- Имя,
    public Cat(String name){
        this.name = name;
        this.age = 5;
        this.weight = 5;
        this.color = "green";
    }
    //Имя, вес, возраст
    public Cat(String name, int weight, int age){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = "red";
    }
    // Имя, возраст (вес стандартный)
    public Cat(String name, int age){
        this.name = name;
        this.age = age;
        this.weight = 10;
        this.color = "red";
    }
    // вес, цвет, (имя, адрес и возраст - неизвестные. Кот - бездомный)
    public Cat(int weight, String color){
        this.age = 15;
        this.weight = weight;
        this.color = color;
    }
    // вес, цвет, адрес (чужой домашний кот)
    public Cat(int weight, String color, String address){
        this.age = 20;
        this.weight = weight;
        this.color = color;
        this.address = address;
    }






    public static void main(String[] args) {

    }
}
