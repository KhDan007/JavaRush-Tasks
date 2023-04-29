package en.javarush.task.jdk13.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Street and houses
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int oddCount = 0;
        int evenCount = 0;

        int[] intArr = new int[15];
        for (int i = 0; i < 15; i++) {
            int currValue = Integer.parseInt(reader.readLine());
            intArr[i] = currValue;
            if (i % 2 == 0) evenCount += currValue;
            else oddCount += currValue;
        }
        if (evenCount > oddCount) {
            System.out.println("Even-numbered houses have more residents.");
        } else if (oddCount > evenCount) {
            System.out.println("Odd-numbered houses have more residents.");
        }
    }
}
