package en.javarush.task.jdk13.task12.task1203;

/* 
Conscious choice
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(isByte(12)); // true
        System.out.println(isShort(130999)); // false
        System.out.println(isInt(1999939990L)); // true
        System.out.println(isInt(19999999939990L)); // false
    }

    public static boolean isByte(long l) {
        return l == (byte) l;
    }

    public static boolean isShort(long l) {
        return l == (short) l;
    }

    public static boolean isInt(long l) {
        return l == (int) l;
    }
}
