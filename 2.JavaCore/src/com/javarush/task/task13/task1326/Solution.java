package com.javarush.task.task13.task1326;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> iEvenList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); Scanner scanner = new Scanner(new FileInputStream(reader.readLine()))) {
            while (scanner.hasNext()) {
                int currValue = scanner.nextInt();
                if (currValue % 2 == 0) {
                    iEvenList.add(currValue);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("You entered invalid file name. " + e);
        }
        Collections.sort(iEvenList);
        for (int elem : iEvenList) {
            System.out.println(elem);
        }
    }
}
