package en.javarush.task.pro.task09.task0919;

/* 
Flipping strings
*/

public class Solution {
    public static void main(String[] args) {
        String string = "The cat is walking backwards";
        System.out.println(string);
        System.out.println(reverseString(string));
    }

    public static String reverseString(String string) {
        StringBuilder builder = new StringBuilder(string);
        builder.reverse();
        return builder.toString();
    }
}
