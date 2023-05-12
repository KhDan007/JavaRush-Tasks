package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String fileName = "";
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName = reader.readLine();
        }
        Set<Integer> byteSet = new HashSet<>();
        try (FileInputStream fileInputStream = new FileInputStream(fileName)) {
            while (fileInputStream.available() > 0) {
                byteSet.add(fileInputStream.read());
            }
        }
        int[] byteArray = new int[byteSet.size()];
        int idx = 0;
        for (int n : byteSet) {
            byteArray[idx] = n;
            idx++;
        }
        Arrays.sort(byteArray);
        for (int n : byteArray) {
            System.out.print(n + " ");
        }
    }
}
