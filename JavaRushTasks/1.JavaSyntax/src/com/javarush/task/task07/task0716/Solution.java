package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
    1. Создай список слов, заполни его самостоятельно.
    2. Метод fix должен:
    2.1. удалять из списка строк все слова, содержащие букву "р"
    2.2. удваивать все слова содержащие букву "л".
    2.3. если слово содержит и букву "р" и букву "л", то оставить это слово без изменений.
    2.4. с другими словами ничего не делать.
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("ррррр");
        strings.add("РРРР");
        strings.add("Лоза");
        strings.add("лира");
        strings.add("тест");
        strings = fix(strings);


        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        //напишите тут ваш код
        int listSize = strings.size();
        for (int i = 0; i < listSize; i++) {
            //check elements from the end due to the OutOfBound exception after .remove method
            String currentString = strings.get(listSize - 1 - i);
            //put the string to temp variable to prevent its modifying
            String temp = currentString.toLowerCase();
            boolean isR = temp.contains("р");
            boolean isL = temp.contains("л");

            // if both conditions are met - do nothing
            if (isR && isL) {  }
            // delete the word if it contains "р"
            else if (isR && !isL) {
                strings.remove(currentString);
            }
            // delete the word if it contains "л"
            else if (!isR && isL) {
                strings.add(listSize - 1 - i, currentString);
            }
        }
        return strings;
    }
}