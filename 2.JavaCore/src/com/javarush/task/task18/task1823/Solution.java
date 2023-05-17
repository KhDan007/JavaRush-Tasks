package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.*;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String line = reader.readLine();
            while (!line.equals("exit")) {
                new ReadThread(line);
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

//        for (Map.Entry<String, Integer> pair : resultMap.entrySet()) {
//            System.out.println(pair.getKey() + ": " + pair.getValue());
//        }
    }

    public static class ReadThread extends Thread {
        private final String fileName;
        public ReadThread(String fileName) {
            this.fileName = fileName;
            start();
        }
        private void readFile() {
            int[] allBytes = new int[256];
            try (FileReader reader = new FileReader(fileName)) {
                while (reader.ready()) {
                    allBytes[reader.read()] += 1;
                }

                int maxFreq = 0;
                ArrayList<Integer> minBytes = new ArrayList<>();
                for (int i = 0; i < allBytes.length; i++) {
                    if (allBytes[i] == 0) continue;
                    if (maxFreq < allBytes[i]) {
                        maxFreq = allBytes[i];
                        if (minBytes.isEmpty()) {
                            minBytes.add(i);
                        } else {
                            minBytes.clear();
                            minBytes.add(i);
                        }
                    } else if (allBytes[i] == maxFreq) {
                        minBytes.add(i);
                    }
                }
                resultMap.putIfAbsent(fileName, minBytes.get(0));
            } catch (IOException e){
                e.printStackTrace();
            }
        }

        @Override
        public void run() {
            readFile();
        }
    }
}
