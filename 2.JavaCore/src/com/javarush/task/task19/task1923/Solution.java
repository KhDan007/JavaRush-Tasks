package com.javarush.task.task19.task1923;

import java.io.*;

/* 
Слова с цифрами
*/

public class Solution {
//    public static void main(String[] args) {
//        try (BufferedReader fileReader = new BufferedReader(new FileReader(args[0]));
//             FileWriter fileWriter = new FileWriter(args[1])
//        ) {
//            String[] words = fileReader.readLine().split(" ");
//            for (String word : words) {
//                if (word.matches(".*\\d.*")) {
//                    fileWriter.write(word + " ");
//                }
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
    public static void main(String[] args) {
        try (BufferedReader fileReader = new BufferedReader(new FileReader(args[0]));
             FileWriter fileWriter = new FileWriter(args[1])) {
            String fileReadLine;
            String[] splitedLine;
            while ((fileReadLine = fileReader.readLine()) != null) {
                splitedLine = fileReadLine.split(" ");
                for (String word : splitedLine) {
                    if (word.matches(".*[0-9].*")) {
                        fileWriter.write(word + " ");
                    }
                }
            }
        } catch (IOException ignored) {
        }
    }
}
