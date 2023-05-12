package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String fileName = null;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName = reader.readLine();
        }
        int[] byteArray = new int[256];
        try (FileInputStream inputStream = new FileInputStream(fileName)) {
            while (inputStream.available() > 0) {
                byteArray[inputStream.read()] += 1;
            }
        }
        int min = Integer.MAX_VALUE;
        for (int n : byteArray) {
            if (n == 0) continue;
            min = Math.min(min, n);
        }
        for (int i = 0; i < byteArray.length; i++) {
            if (min == byteArray[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
