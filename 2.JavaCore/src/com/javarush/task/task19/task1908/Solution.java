package com.javarush.task.task19.task1908;

import java.io.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Выделяем числа
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader fr = new BufferedReader(new FileReader(reader.readLine()));
             BufferedWriter fw = new BufferedWriter(new FileWriter(reader.readLine(), true))
        ) {
            StringBuilder text = new StringBuilder();
            while (fr.ready()) {
                text.append(fr.readLine());
            }
            Matcher matcher = Pattern.compile("\\b\\d+\\b").matcher(text.toString());
            while (matcher.find()) {
                fw.append(matcher.group());
                fw.append(" ");
            }
        }
    }
}
