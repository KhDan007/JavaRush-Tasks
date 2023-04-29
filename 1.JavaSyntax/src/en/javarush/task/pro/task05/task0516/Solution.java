package en.javarush.task.pro.task05.task0516;

import java.util.Arrays;

/* 
Filling an array
*/

public class Solution {

    public static int[] array = new int[20];
    public static int valueStart = 10;
    public static int valueEnd = 13;

    public static void main(String[] args) {
        int len = array.length;
        if (len % 2 == 0) {
            Arrays.fill(array, 0, len/2, valueStart);
            Arrays.fill(array, len/2, len, valueEnd);
        } else {
            Arrays.fill(array, 0, len/2+1, valueStart);
            Arrays.fill(array, len/2+1, len, valueEnd);
        }
        System.out.println(Arrays.toString(array));
    }
}
