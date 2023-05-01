package en.javarush.task.jdk13.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Maximum and minimum numbers in an array
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] numbers = new int[20];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());
        }

        int maximum = numbers[0];
        int minimum = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            minimum = Math.min(minimum, numbers[i]);
            maximum = Math.max(maximum, numbers[i]);
        }
        
        System.out.print(maximum + " " + minimum);
    }
}
