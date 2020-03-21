package com.javarush.task.task05.task0529;
import java.io.*;
/* 
    Консоль-копилка
    Вводить с клавиатуры числа и считать их сумму, пока пользователь не введет слово "сумма".
    Вывести на экран полученную сумму.
    Подсказка: реализовать считывание с клавиатуры, пока не будет введена определенная строка, например "exit", можно с помощью следующей конструкции:

    - добавить поддержку ввода
    - реализовать ввод до слова "сумма"
    - вывод и расчёт суммы
    - перепроверить условие
- протестировать

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //добавить поддержку ввода
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //main variables
        int sum = 0;
        int number;


        //реализовать ввод до слова "сумма"
        while(true){
            String s = reader.readLine();
            if (s.equals("сумма")){
                System.out.println(sum);
                break;
            }
            else{
                number = Integer.parseInt(s);
                sum += number;
            }
        }
    }
}
