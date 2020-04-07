package com.javarush.task.task08.task0807;

/* 
LinkedList и ArrayList
Нужно создать два списка - LinkedList и ArrayList.
    1. Программа не должна выводить текст на экран.
    2. Программа не должна считывать значения с клавиатуры.
    3. Программа должна содержать только три метода.
    4. Метод createArrayList() должен создавать и возвращать список ArrayList.
    5. Метод createLinkedList() должен создавать и возвращать список LinkedList.
*/

import java.util.ArrayList;
import java.util.LinkedList;

public class Solution {
    public static Object createArrayList() {
        //напишите тут ваш код
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("test one");
        arrayList.add("test one");
        arrayList.add("test one");
        arrayList.add("test one");
        arrayList.add("test one");
        arrayList.add("test one");

        return arrayList;
    }

    public static Object createLinkedList() {
        //напишите тут ваш код
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("test two");
        linkedList.add("test two");
        linkedList.add("test two");
        linkedList.add("test two");
        linkedList.add("test two");

        return linkedList;
    }

    public static void main(String[] args) {
        createArrayList();
        createLinkedList();
    }
}
