package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        int centralIndex = fileName.indexOf(".part");
        String firstPart = fileName.substring(0, centralIndex);

        ArrayList<String> fileList = new ArrayList<>();
        while (!fileName.equals("end")) {
            fileList.add(fileName);
            fileName = reader.readLine();
        }
        String[] fileOrder = new String[fileList.size()];
        for (String fileNName : fileList) {
            int curIndex = Integer.parseInt(String.valueOf(fileNName.charAt(fileNName.length()-1))) - 1;
            fileOrder[curIndex] = fileNName;
        }

        for (String fileN : fileOrder) {
            writeBuffer(firstPart, getBuffer(fileN));
        }
    }

    public static byte[] getBuffer(String fileName) throws IOException {
        byte[] buffer;
        try (FileInputStream fileInputStream = new FileInputStream(fileName)) {
            buffer = new byte[fileInputStream.available()];
            fileInputStream.read(buffer);
        }
        return buffer;
    }

    public static void writeBuffer(String fileName, byte[] buffer) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(fileName, true)) {
            fileOutputStream.write(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
