package com.javarush.task.task18.task1808;

import java.io.*;

/* 
Разделение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName1;
        String fileName2;
        String fileName3;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName1 = reader.readLine();
            fileName2 = reader.readLine();
            fileName3 = reader.readLine();
        }
        byte[] firstPart;
        byte[] secondPart;
        try (FileInputStream f = new FileInputStream(fileName1)) {
            if (f.available() % 2 == 0) {
                firstPart = new byte[f.available() / 2];
                secondPart = new byte[f.available() / 2];
            } else {
                firstPart = new byte[(f.available() + 1) / 2];
                secondPart = new byte[(f.available() - 1) / 2];
            }
            f.read(firstPart);
            f.read(secondPart);
        }
        try (FileOutputStream f = new FileOutputStream(fileName2)) {
            f.write(firstPart);
        }
        try (FileOutputStream f = new FileOutputStream(fileName3)) {
            f.write(secondPart);
        }
    }
}