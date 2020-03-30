package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
    1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
    Число нацело делится на 3 (x%3==0), нацело делится на 2 (x%2==0) и все остальные.
    Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
    Порядок объявления списков очень важен.
    2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        //1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
        ArrayList<Integer> listFromKeyboard = new ArrayList<>();
        ArrayList<Integer> listDividedByThree = new ArrayList<>();
        ArrayList<Integer> listDividedByTwo = new ArrayList<>();
        ArrayList<Integer> listNotDividedByTwoOrThree = new ArrayList<>();

        int listSize = 20;
        for(int i = 0; i < listSize; i++){
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String sItem = reader.readLine();
            int nItem = Integer.parseInt(sItem);
            listFromKeyboard.add(nItem);

            if (nItem % 3 == 0 && nItem % 2 == 0) {
                listDividedByTwo.add(nItem);
                listDividedByThree.add(nItem);
            }
            else if (nItem % 2 == 0 && nItem % 2 != 0)
                listDividedByThree.add(nItem);
            else if (nItem % 2 == 0 && nItem % 3 != 0)
                listDividedByTwo.add(nItem);
            else
                listNotDividedByTwoOrThree.add(nItem);
        }

        printList(listDividedByThree);
        printList(listDividedByTwo);
        printList(listNotDividedByTwoOrThree);



    }

    public static void printList(ArrayList<Integer> list) {
        //напишите тут ваш код
        int listSize = list.size();
        for(int number : list ){
            System.out.println(number);
        }
    }
}
