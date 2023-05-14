package com.javarush.task.task18.task1828;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Прайсы 2
*/

public class Solution {
    public static void main(String[] args) {
        String fileName = null;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (fileName == null) return;

        try (BufferedReader fReader = new BufferedReader(new FileReader(fileName));
             BufferedWriter fWriter = new BufferedWriter(new FileWriter(fileName, true))
        ) {

                StringBuilder allLinesBuilder = new StringBuilder();

                if (args[0].equals("-u")) {
                    while (fReader.ready()) {
                        String line = fReader.readLine();
                        int curId = Integer.parseInt(line.substring(0, 8).trim());
                        if (curId == Integer.parseInt(args[1])) {
                            line = String.format("%-8d%-30s%-8s%-4s", curId, args[2], args[3], args[4]);
                        }
                        allLinesBuilder.append(line);
                        if (fReader.ready()) {
                            allLinesBuilder.append("\n");
                        }
                    }
                } else if (args[0].equals("-d")) {
                    while (fReader.ready()) {
                        String line = fReader.readLine();
                        int curId = Integer.parseInt(line.substring(0, 8).trim());
                        if (curId == Integer.parseInt(args[1])) {
                            continue;
                        }
                        allLinesBuilder.append(line);
                        if (fReader.ready()) {
                            allLinesBuilder.append("\n");
                        }
                    }
                }
            clearFile(fileName);
                fWriter.write(allLinesBuilder.toString());

        } catch (IOException ignored) {}
    }

    public static void clearFile(String path) {
        try {
            new FileWriter(path).close();
        } catch (IOException ignored) {}
    }
}
