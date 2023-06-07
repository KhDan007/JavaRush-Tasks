package com.javarush.task.task19.task1919;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/* 
Считаем зарплаты
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Double> map = new HashMap<>();
        try (BufferedReader fileReader = new BufferedReader(new FileReader(args[0]))) {
            while (fileReader.ready()) {
                String[] lineData = fileReader.readLine().split(" ");
                map.computeIfPresent(lineData[0], (key, val) -> val + Double.parseDouble(lineData[1]));
                map.putIfAbsent(lineData[0], Double.parseDouble(lineData[1]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        map = new TreeMap<>(map);
        for (Map.Entry<String, Double> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

}
