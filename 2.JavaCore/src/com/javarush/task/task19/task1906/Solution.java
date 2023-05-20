package com.javarush.task.task19.task1906;

import java.io.*;
import java.util.ArrayList;

/* 
Четные символы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileReader fr = new FileReader(reader.readLine());
             FileWriter fw = new FileWriter(reader.readLine())
        ) {
            boolean isEven = false;
            while (fr.ready()) {
                int character = fr.read();
                if (!isEven) {
                    isEven = true;
                } else {
                    fw.write(character);
                    isEven = false;
                }
            }
        }
    }
}
