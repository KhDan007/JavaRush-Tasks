package en.javarush.task.jdk13.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
The largest number
*/

public class Solution {

    private static ArrayList<Integer> integers = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        // Initializing a scanner
        Scanner scanner = new Scanner(System.in);
        // Filling the list with 5 integers from keyboard
        for (int i = 0; i < 5; i++) {
            integers.add(scanner.nextInt());
        }
        // Finding the maximum value
        int tempMax = integers.get(0);
        for (Integer integer : integers) {
            tempMax = Math.max(tempMax, integer);
        }
        System.out.println(tempMax);
    }
}
