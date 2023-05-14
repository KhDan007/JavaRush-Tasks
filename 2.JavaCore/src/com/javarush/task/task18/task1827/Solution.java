package com.javarush.task.task18.task1827;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Прайсы
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        if (args.length == 0 || !args[0].equals("-c")) return;
        String fileName = null;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName = reader.readLine();
        }

        try (BufferedReader f = new BufferedReader(new FileReader(fileName)); BufferedWriter fw = new BufferedWriter(new FileWriter(fileName, true))) {
            int maxId = 0;
            while (f.ready()) {
                int curIntId = 0;
                try {
                    curIntId = Integer.parseInt(f.readLine().substring(0, 8).trim());
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
                maxId = Math.max(maxId, curIntId);
            }

            // =============================================

            fw.write("\r\n");
            if (args[1].length() > 30) {
                args[1] = args[1].substring(0, 30);
            }
            if (args[2].length() > 8) {
                args[2] = args[2].substring(0, 8);
            }
            if (args[3].length() > 4) {
                args[3] = args[3].substring(0, 4);
            }

            String addedRow = String.format("%-8d", ++maxId) + String.format("%-30s", args[1]) + String.format("%-8s", args[2]) + String.format("%-4s", args[3]);
            fw.write(addedRow);
        }
    }
}
