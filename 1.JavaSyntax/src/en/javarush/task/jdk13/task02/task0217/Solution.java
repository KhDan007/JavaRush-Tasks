package en.javarush.task.jdk13.task02.task0217;

/* 
Minimum of four numbers
*/

public class Solution {
    public static int min(int a, int b, int c, int d) {
        int[] array = {a,b,c,d};
        int currMin = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array.length == 1) break;
            currMin = min(currMin, array[i]);
        }
        return currMin;
    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }

    public static void main(String[] args) {
        System.out.println(min(-20, -10));
        System.out.println(min(-40, -10, -30, 40));
        System.out.println(min(-20, -40, -30, 40));
        System.out.println(min(-20, -10, -40, 40));
        System.out.println(min(-20, -10, -30, -40));
    }
}
