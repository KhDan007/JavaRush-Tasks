package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String value = reader.readLine();
        while (!value.equals("exit")) {
            double doubleValue;
            int intValue;
            try {
                intValue = Integer.parseInt(value);

                if (0 < intValue && intValue < 128) {
                    print(Short.parseShort(value));
                    value = reader.readLine();
                    continue;
                } else {
                    print(Integer.valueOf(value));
                    value = reader.readLine();
                    continue;
                }
            } catch (NumberFormatException e) {
                //
            }

            try {
                doubleValue = Double.parseDouble(value);
                print(doubleValue);
                value = reader.readLine();
                continue;
            } catch (NumberFormatException e) {
                //
            }

            print(value);

            value = reader.readLine();
        }

        reader.close();
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
