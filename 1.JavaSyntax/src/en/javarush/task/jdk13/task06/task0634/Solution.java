package en.javarush.task.jdk13.task06.task0634;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Chess board
*/

public class Solution {
    public static char[][] array;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dim = scanner.nextInt();
        array = new char[dim][dim];
        boolean condition = true;
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                if (condition) {
                    array[i][j] = '#';
                    condition = false;
                } else {
                    array[i][j] = ' ';
                    condition = true;
                }
            }
            if (dim % 2 == 0) condition = !condition;
        }
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
