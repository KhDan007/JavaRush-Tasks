package en.javarush.task.jdk13.task02.task0214;

/* 
Minimum of two numbers
*/

public class Solution {
    public static int min(int a, int b) {
        return a < b ? a : b;
    }

    public static void main(String[] args) {
        System.out.println(min(12, 33));
        System.out.println(min(-20, 0));
        System.out.println(min(-10, -20));
    }
}
