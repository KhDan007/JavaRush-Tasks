package en.javarush.task.pro.task06.task0605;

/* 
Correct order
*/

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        printArray(array);
        reverseArray(array);
        printArray(array);
    }

    public static void reverseArray(int[] array) {
        int[] copy = Arrays.copyOf(array, array.length);
        for (int i = 0; i < array.length; i++) {
            array[i] = copy[array.length-1-i];
        }
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
