package com.javarush.task.task18.task1817;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* 
Пробелы
*/

public class Solution {
    public static void main(String[] args) {
        double totalCharactersCount = 0;
        double spacesCount = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            while (reader.ready()) {
                char curCharacter = Character.toChars(reader.read())[0];
                if (curCharacter == ' ') {
                    spacesCount++;
                }
                totalCharactersCount++;
            }
        } catch (IOException ignored) {}
        System.out.println(roundTwoDecimals(spacesCount / totalCharactersCount * 100));
    }

    public static double roundTwoDecimals(double d) {
        d = Math.round(d * 100);
        return d/100;
    }
}
