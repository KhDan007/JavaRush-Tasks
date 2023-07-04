package com.javarush.task.task19.task1926;

import java.io.*;

/* 
Перевертыши
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        StringBuilder f1sb = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader f1reader = new BufferedReader(new FileReader(reader.readLine()))
        ) {
            while (f1reader.ready()) {
                String line = f1reader.readLine();
                StringBuilder newLineBuilder = new StringBuilder();
                for (int i = line.length()-1; i >= 0; i--) {
                    newLineBuilder.append(line.charAt(i));
                }
                f1sb.append(newLineBuilder);
                if (f1reader.ready()) f1sb.append("\n");
            }
            System.out.println(f1sb);
        }
    }
}
