package en.javarush.task.jdk13.task12.task1205;

/* 
But that's how I want it
*/

public class Solution {

    private static final String UNEXPECTED_TYPE = "I didn't expect this type of number!";

    public static void main(String[] args) {
        System.out.println(toCustomString((byte) 12));
        System.out.println(toCustomString(12));
        System.out.println(toCustomString(12.));
        System.out.println(toCustomString(12L));
    }

    public static String toCustomString(Number number) {
        if (number instanceof Byte) {
            return String.valueOf(((byte) number / 2) + "b");
        } else if (number instanceof Integer) {
            return String.valueOf((int) number / 3);
        } else if (number instanceof Double) {
            return String.valueOf((double) number * 20);
        } else {
            return UNEXPECTED_TYPE;
        }
    }
}
