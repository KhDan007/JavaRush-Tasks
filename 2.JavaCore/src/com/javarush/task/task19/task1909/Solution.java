package com.javarush.task.task19.task1909;

import java.io.*;
import java.util.ArrayList;

/* 
Замена знаков
*/

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader fr = new BufferedReader(new FileReader(reader.readLine()));
             BufferedWriter fw = new BufferedWriter(new FileWriter(reader.readLine()));
        ) {
            StringBuilder text = new StringBuilder();
            while (fr.ready()) {
                text.append(fr.readLine());
                if (fr.ready()) text.append("\n");
            }
            String newText = text.toString().replaceAll("\\.", "!");
            fw.write(newText);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
