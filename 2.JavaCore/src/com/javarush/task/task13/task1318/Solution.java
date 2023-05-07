package com.javarush.task.task13.task1318;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String path = reader.readLine();
        InputStreamReader fileReader = new InputStreamReader(new FileInputStream(path));
        StringBuilder output = new StringBuilder();
        while (fileReader.ready()) {
            output.append(Character.toChars(fileReader.read()));
        }
        System.out.println(output);
        reader.close();
        fileReader.close();
    }
}