package com.javarush.task.task18.task1818;

import java.io.*;

/* 
Два в одном
*/

public class Solution {
    public static void main(String[] args) {
        String fileName1 = null;
        String fileName2 = null;
        String fileName3 = null;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName1 = reader.readLine();
            fileName2 = reader.readLine();
            fileName3 = reader.readLine();
        } catch (IOException ignored) {}

        if (fileName1==null || fileName2==null || fileName3==null) return;

        try (BufferedWriter fileWriter1 = new BufferedWriter(new FileWriter(fileName1, true));
            BufferedReader fileReader2 = new BufferedReader(new FileReader(fileName2));
            BufferedReader fileReader3 = new BufferedReader(new FileReader(fileName3))
        ) {
            StringBuilder file2ContentsBuilder = new StringBuilder();
            while (fileReader2.ready()) {
                file2ContentsBuilder.append(fileReader2.readLine());
                if (fileReader2.ready()) file2ContentsBuilder.append("\n");
            }
            fileWriter1.write(file2ContentsBuilder.toString());

            StringBuilder file3ContentsBuilder = new StringBuilder();
            while (fileReader3.ready()) {
                file3ContentsBuilder.append(fileReader3.readLine());
                if (fileReader3.ready()) file3ContentsBuilder.append("\n");
            }
            fileWriter1.write(file3ContentsBuilder.toString());

        } catch (IOException ignored) {}
    }
}
