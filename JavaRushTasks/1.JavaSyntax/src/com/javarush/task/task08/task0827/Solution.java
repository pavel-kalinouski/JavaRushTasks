package com.javarush.task.task08.task0827;

/* 
    Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате FEBRUARY 1 2013
    Не забудьте учесть первый день года.
    Пример:
    JANUARY 1 2000 = true
    JANUARY 2 2020 = false
    Требования:
    1. Программа должна выводить текст на экран.
    2. Класс Solution должен содержать два метода.
    3. Метод isDateOdd() должен возвращать true, если количество дней с начала года - нечетное число, иначе false.
    4. Метод main() должен вызывать метод isDateOdd().
*/

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Solution {
    public static void main(String[] args) throws ParseException {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String initialDate) throws ParseException  {
        DateFormat formatter = new SimpleDateFormat("MMMMM d YYYY", Locale.ENGLISH);
        Calendar startDate = Calendar.getInstance();
        startDate.setTime(formatter.parse(initialDate));

        return startDate.get(Calendar.DAY_OF_YEAR) %2 != 0;
    }
}
