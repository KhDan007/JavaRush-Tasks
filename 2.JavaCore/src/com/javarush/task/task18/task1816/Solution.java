package com.javarush.task.task18.task1816;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* 
Английские буквы
*/

public class Solution {
    public static void main(String[] args) {
        int englishLetterCount = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            while (reader.ready()) {
                String curCharacter = String.valueOf(Character.toChars(reader.read())[0]);
                if (curCharacter.matches("[a-zA-z]+")) {
                    englishLetterCount++;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(englishLetterCount);
    }
}
