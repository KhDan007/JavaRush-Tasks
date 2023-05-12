package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String fileName = "";
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName = reader.readLine();
        }
        Map<Integer, Integer> bytesFrequency = new HashMap<>();
        try (FileInputStream iStream = new FileInputStream(fileName)) {
            while (iStream.available() > 0) {
                int curByte = iStream.read();
                bytesFrequency.computeIfPresent(curByte, (key, val) -> val + 1);
                bytesFrequency.putIfAbsent(curByte, 1);
            }
        }
        int maxFrequencyCount = 0;
        ArrayList<Integer> maxFrequencyBytes = new ArrayList<>();
        for (Map.Entry<Integer, Integer> pair : bytesFrequency.entrySet()) {
            if (maxFrequencyCount < pair.getValue()) {
                maxFrequencyCount = pair.getValue();
                maxFrequencyBytes.clear();
                maxFrequencyBytes.add(pair.getKey());
            } else if (maxFrequencyCount == pair.getValue()) {
                maxFrequencyBytes.add(pair.getKey());
            }
        }
        for (int n : maxFrequencyBytes) {
            System.out.print(n + " ");
        }
    }
}
