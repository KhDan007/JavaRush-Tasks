package com.javarush.task.task19.task1920;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/* 
Самый богатый
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Double> map = new HashMap<>();
        try (BufferedReader fileReader = new BufferedReader(new FileReader(args[0]))) {
            while (fileReader.ready()) {
                String[] lineData = fileReader.readLine().split(" ");
                map.computeIfPresent(lineData[0], (k,v) -> v + Double.parseDouble(lineData[1]));
                map.putIfAbsent(lineData[0], Double.parseDouble(lineData[1]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        double maxValue = 0;
        for (double val : map.values()) {
            maxValue = Math.max(val, maxValue);
        }
        List<String> maxValuePeople = new ArrayList<>();
        for (Map.Entry<String, Double> pair : map.entrySet()) {
            if (pair.getValue() == maxValue) {
                maxValuePeople.add(pair.getKey());
            }
        }
        Collections.sort(maxValuePeople);
        for (String person : maxValuePeople) {
            System.out.print(person + " ");
        }
    }
}
