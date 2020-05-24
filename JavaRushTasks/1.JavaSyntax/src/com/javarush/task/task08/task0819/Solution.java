package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
    Set из котов
    1. Внутри класса Solution создать public static класс кот - Cat.
    2. Реализовать метод createCats, он должен создавать множество (Set) котов и добавлять в него 3 кота.
    3. В методе main удалите одного кота из Set cats.
    4. Реализовать метод printCats, он должен вывести на экран всех котов, которые остались во множестве.
    Каждый кот с новой строки.
    Требования:
    1. Программа должна выводить текст на экран.
    2. Внутри класса Solution должен быть public static класс Cat с конструктором по умолчанию.
    3   . Метод createCats() класса Solution должен возвращать множество (Set), содержащее 3 кота.
    4. Метод printCats() класса Solution должен вывести на экран всех котов из множества. Каждый кот с новой строки.
    5. Метод main() должен один раз вызывать метод createCats().
    6.  Метод main() должен вызывать метод printCats().
    7. Метод main() должен удалять одного кота из множества котов.
*/

public class Solution {
    public static Set<Cat> createCats() {
        //напишите тут ваш код. step 2 - пункт 2
        Set<Cat> cats = new HashSet<>();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);

        return cats;
    }

    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        //напишите тут ваш код. step 3 - пункт 3.
        Iterator<Cat> iterator = cats.iterator();
        Cat item = iterator.next();
        cats.remove(item);


        printCats(cats);
    }


    public static void printCats(Set<Cat> cats) {
        // step 4 - пункт 4
        for(Cat cat : cats){
            System.out.println(cat);
        }
    }

    // step 1 - пункт 1
    public static class Cat{
        public Cat(){

        }
    }
}
