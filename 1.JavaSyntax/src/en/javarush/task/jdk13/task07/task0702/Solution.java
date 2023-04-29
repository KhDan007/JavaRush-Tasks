package en.javarush.task.jdk13.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
String array in reverse order
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] arr = new String[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 8; i++) {
            arr[i] = reader.readLine();
        }
        for (int i = 9; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}