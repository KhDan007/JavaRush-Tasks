package en.javarush.task.jdk13.task01.task0136;

/* 
Even to the moon!
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getWeight(888));
    }

    public static double getWeight(int earthWeight) {
        return earthWeight * 0.17;
    }
}