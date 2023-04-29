package en.javarush.task.jdk13.task02.task0216;

/* 
Minimum of three numbers
*/

public class Solution {
    public static int min(int a, int b, int c) {
        if (a < b && a < c) return a;
        else if (b < a && b < c) return b;
        else if (a == b && a < c) return a;
        else if (b == c && b < a) return b;
        else return c;
    }

    public static void main(String[] args) {
        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(5, 5, 10));
    }
}
