package com.javarush.task.task19.task1910;

import java.io.*;

/* 
Пунктуация
*/

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader fr = new BufferedReader(new FileReader(reader.readLine()));
             BufferedWriter fw = new BufferedWriter(new FileWriter(reader.readLine()))
        ) {
            StringBuilder text = new StringBuilder();
            while (fr.ready()) {
                text.append(fr.readLine());
            }
            String newText = text.toString().replaceAll("\\p{Punct}", "");
            fw.write(newText);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
