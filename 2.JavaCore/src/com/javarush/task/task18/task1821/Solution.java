package com.javarush.task.task18.task1821;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/* 
Встречаемость символов
*/

public class Solution {
    public static void main(String[] args) {
        Map<Character, Integer> characterFrequencyMap = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            while (reader.ready()) {
                char curChar = Character.toChars(reader.read())[0];
                characterFrequencyMap.computeIfPresent(curChar, (x,y) -> y+1);
                characterFrequencyMap.putIfAbsent(curChar, 1);
            }
            characterFrequencyMap = new TreeMap<>(characterFrequencyMap);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Map.Entry<Character, Integer> pair : characterFrequencyMap.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }
}
