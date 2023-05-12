package com.javarush.task.task18.task1807;

import java.io.*;

/* 
Подсчет запятых
*/

public class Solution {
    public static void main(String[] args) {
        String fileName = "";
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName = reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        int count = 0;
        try (FileInputStream fileInputStream = new FileInputStream(fileName)) {
            while (fileInputStream.available() > 0) {
                byte curByte = (byte) fileInputStream.read();
                char selectedSymbol = ',';
                if ((byte) selectedSymbol == curByte) {
                    count++;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Couldn't find the file specified " + e);
        } catch (IOException e) {
            System.out.println("General I/O exception " + e);
        }
        System.out.println(count);
    }
}
