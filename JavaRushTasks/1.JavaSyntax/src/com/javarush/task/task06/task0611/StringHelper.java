package com.javarush.task.task06.task0611;

/* 
    Класс StringHelper
    Сделать класс StringHelper, у которого будут 2 статических метода:
    String multiply(String s, int count) - возвращает строку повторенную count раз.
    String multiply(String s) - возвращает строку повторенную 5 раз.
    - условие
    - протестировать
*/

public class StringHelper {
    public static String multiply(String s) {
        String result = "";
        int timesToRepeat = 5;
        for (int i = 0; i < timesToRepeat; i++){
            result = result.concat(s);
        }
        return result;
    }

    public static String multiply(String s, int count) {
        String result = "";
        for (int i = 0; i < count; i++){
            result = result.concat(s);
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
