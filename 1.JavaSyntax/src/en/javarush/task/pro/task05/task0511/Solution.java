package en.javarush.task.pro.task05.task0511;

import java.util.Scanner;

/* 
Creating a two-dimensional array
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int R = scanner.nextInt();
        multiArray = new int[R][];
        for (int i = 0; i < R; i++) {
            int cols = scanner.nextInt();
            multiArray[i] = new int[cols];
        }
    }
}
