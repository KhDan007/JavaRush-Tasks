package com.javarush.task.task19.task1925;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

/* 
Длинные слова
*/

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]));
             BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]))
        ) {
            ArrayList<String> f1ContentList = new ArrayList<>();
            while (reader.ready()) {
                f1ContentList.add(reader.readLine());
            }
            StringBuilder f2sb = new StringBuilder();
            for (String line : f1ContentList) {
                String[] splitedLine = line.split(" ");
                for (String word : splitedLine) {
                    if (word.length() > 6) {
                        f2sb.append(word).append(",");
                    }
                }
            }
            writer.write(f2sb.substring(0, f2sb.toString().length()-1));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
