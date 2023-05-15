package com.javarush.task.task18.task1820;

import java.io.*;

/* 
Округление чисел
*/

public class Solution {
    public static void main(String[] args) {
        String fileName1 = null;
        String fileName2 = null;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName1 = reader.readLine();
            fileName2 = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (fileName1 == null || fileName2 == null) return;

        try (BufferedReader fR = new BufferedReader(new FileReader(fileName1));
             BufferedWriter fW = new BufferedWriter(new FileWriter(fileName2, true));
        ) {
            StringBuilder f1ContentsBuilder = new StringBuilder();
            while (fR.ready()) {
                f1ContentsBuilder.append(fR.readLine());
                if (fR.ready()) f1ContentsBuilder.append("\n");
            }
            String[] f1Contents = f1ContentsBuilder.toString().split(" ");

            for (String f1Content : f1Contents) {
                fW.append(String.valueOf(Math.round(Double.parseDouble(f1Content)))).append(" ");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
