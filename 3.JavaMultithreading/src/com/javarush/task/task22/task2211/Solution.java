package com.javarush.task.task22.task2211;

import java.io.*;
import java.nio.charset.StandardCharsets;

/* 
Смена кодировки
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (FileInputStream fr = new FileInputStream(args[0]);
             BufferedWriter writer = new BufferedWriter(new FileWriter(args[1], true))
        ) {
            byte[] bytes = new byte[1000];
            while (fr.available() > 0) {
                int count = fr.read(bytes);
                String string = new String(bytes, "Windows-1251");
                writer.write(new String(string.getBytes(), StandardCharsets.UTF_8), 0, count);
            }
        }
    }
}
