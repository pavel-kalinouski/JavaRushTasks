package com.javarush.task.task07.task0715;

/* 
Продолжаем мыть раму
1. Создай список из слов "мама", "мыла", "раму".
2. После каждого слова вставь в список строку, содержащую слово "именно".
3. Вывести результат на экран, каждый элемент списка с новой строки.
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        String[] list = {"мама", "мыла", "раму"};
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < 3; i++){
            strings.add(list[i]);
            strings.add("именно");
        }

        for(String string : strings) System.out.println(string);
    }
}
