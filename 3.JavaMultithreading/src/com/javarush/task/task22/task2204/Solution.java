package com.javarush.task.task22.task2204;

/* 
Форматирование строки
*/

import java.text.DecimalFormat;
import java.util.Formatter;
import java.util.Locale;

public class Solution {
    public static void main(String[] args) {
        System.out.println(String.format(Locale.GERMANY, getFormattedString(), 20.0 / 7.0, 10.0 / 3.0));
        //должен быть вывод
        //20 / 7 = 2,86
        //Exp = 3,33e+00
    }

    public static String getFormattedString() {
        return "20 / 7 = %.2f%nExp = %.2e";
    }
}
