package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
        String fileName1;
        String fileName2;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName1 = reader.readLine();
            fileName2 = reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (Scanner scanner = new Scanner(new FileInputStream(fileName1))) {
            while (scanner.hasNext()) {
                allLines.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        try (Scanner scanner = new Scanner(new FileInputStream(fileName2))) {
            while (scanner.hasNext()) {
                forRemoveLines.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        Solution sol = new Solution();
        try {
            sol.joinData();
        } catch (CorruptedDataException e) {
            e.printStackTrace();
        }
    }

    public void joinData() throws CorruptedDataException {
        boolean isContainsAll = true;
        for (String s : forRemoveLines) {
            if (!allLines.contains(s)) {
                isContainsAll = false;
            }
        }

        if (isContainsAll) {
            for (String s : forRemoveLines) {
                allLines.remove(s);
            }
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
