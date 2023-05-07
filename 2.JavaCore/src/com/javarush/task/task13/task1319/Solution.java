package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedWriter fileWriter = null;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String fileName = reader.readLine();
            fileWriter = new BufferedWriter(new FileWriter(fileName));

            String fileLine = reader.readLine();
            while (!fileLine.equals("exit")) {
                fileWriter.write(fileLine + "\n");
                fileLine = reader.readLine();
            }
            fileWriter.write("exit");

        } catch (IOException e) {
            System.out.println(e);
        } finally {
            if (fileWriter != null) {
                fileWriter.close();
            }
        }

    }
}
