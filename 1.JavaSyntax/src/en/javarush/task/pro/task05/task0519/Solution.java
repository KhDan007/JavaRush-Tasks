package en.javarush.task.pro.task05.task0519;

import java.util.Arrays;

/* 
Is anyone there?
*/

public class Solution {

    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    public static int element = 7;

    public static void main(String[] args) {
        int[] copyArr = Arrays.copyOf(array, array.length);
        Arrays.sort(copyArr);
        System.out.println(Arrays.binarySearch(copyArr, element) >= 0);
    }
}
