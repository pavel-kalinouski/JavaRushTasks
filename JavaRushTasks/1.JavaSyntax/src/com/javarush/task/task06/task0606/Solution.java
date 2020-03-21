package com.javarush.task.task06.task0606;
import java.io.*;

/* 
    Чётные и нечётные циферки
    Ввести с клавиатуры число. Определить, сколько в введенном числе четных цифр, а сколько нечетных.
Если число делится без остатка на 2 (т. е. остаток равен нулю), значит оно четное.
Увеличиваем на 1 счетчик четных цифр (статическая переменная even).
Иначе число нечетное, увеличиваем счетчик нечетных цифр (статическая переменная odd).
Вывести на экран сообщение: "Even: а Odd: b", где а - количество четных цифр, b - количество нечетных цифр.
- протестировать
- перепроверить условие
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //напишите тут ваш код

        //variables
        String sNum = reader.readLine();
        int length = sNum.length();

        //parse the word on characters & convert it to int
        for(int i = 0; i < length; i++){
            int digit = Character.getNumericValue(sNum.charAt(i));
            if (digit == 0 ) {}
            else if (digit % 2 == 0 ) even++;
            else if (digit % 2 != 0 ) odd++;
        }

        System.out.println("Even: " + even + " Odd: " + odd);


    }
}
