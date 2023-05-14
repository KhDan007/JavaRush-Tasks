package com.javarush.task.task18.task1819;

import java.io.*;

/* 
Объединение файлов
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

        StringBuilder f1Contents = null;
        try (BufferedReader f1Reader = new BufferedReader(new FileReader(fileName1))) {
            f1Contents = new StringBuilder();
            while (f1Reader.ready()) {
                f1Contents.append(f1Reader.readLine());
                if (f1Reader.ready()) f1Contents.append("\r\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (
            BufferedWriter f1Writer = new BufferedWriter(new FileWriter(fileName1));
            BufferedReader f2Reader = new BufferedReader(new FileReader(fileName2))
        ) {
            StringBuilder f2Contents = new StringBuilder();
            while (f2Reader.ready()) {
                f2Contents.append(f2Reader.readLine());
                if (f2Reader.ready()) f2Contents.append("\r\n");
            }

            f2Contents.append(f1Contents);
            f1Writer.write(f2Contents.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
