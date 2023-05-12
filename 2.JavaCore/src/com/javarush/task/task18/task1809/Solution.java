package com.javarush.task.task18.task1809;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* 
Реверс файла
*/

public class Solution {
    public static void main(String[] args) {
        String fileName1;
        String fileName2;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName1 = reader.readLine();
            fileName2 = reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (FileInputStream fileInputStream = new FileInputStream(fileName1);
            FileOutputStream fileOutputStream = new FileOutputStream(fileName2)) {

            byte[] buffer = new byte[fileInputStream.available()];
            fileInputStream.read(buffer);
            byte[] copy = new byte[buffer.length];
            for (int i = 0; i < buffer.length; i++) {
                copy[i] = buffer[buffer.length - 1 - i];
            }
            fileOutputStream.write(copy);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
