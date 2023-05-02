package en.javarush.task.jdk13.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Longest sequence
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> numbers = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            numbers.add(Integer.parseInt(reader.readLine()));
        }
        int prev = numbers.get(0);
        int maxCount = 0;
        int currCount = 0;
        for (int i = 0; i < numbers.size(); i++) {
            currCount++;
            if (prev != numbers.get(i)) {
                prev = numbers.get(i);
                currCount = 1;
            }
            maxCount = Math.max(currCount, maxCount);
        }
        System.out.println(maxCount);
    }
}
