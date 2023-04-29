package en.javarush.task.jdk13.task12.task1202;

/* 
Approximate value
*/

public class Solution {

    public static void main(String[] args) {
        int big = 1234567890;

        System.out.println(getDifference(big)); // 46 or -46
    }

    public static int getDifference(int big) {
        float approx = big;

        return big - (int) approx;
    }
}
