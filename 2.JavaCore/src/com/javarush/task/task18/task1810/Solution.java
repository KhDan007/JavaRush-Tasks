package com.javarush.task.task18.task1810;

import java.io.*;

/* 
DownloadException
*/

public class Solution {
    public static void main(String[] args) throws DownloadException {
        boolean shouldThrow = false;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))
        ) {
            while (true) {
                String fileName = reader.readLine();
                try (FileInputStream f = new FileInputStream(fileName)) {
                    if (f.available() < 1000) {
                        shouldThrow = true;
                        break;
                    }
                } catch (FileNotFoundException e) {
                    System.out.println("File is not found!");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        if (shouldThrow) {
            throw new DownloadException();
        }
    }

    public static class DownloadException extends Exception {

    }
}
