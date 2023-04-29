package en.javarush.task.jdk13.task10.task1003;

/* 
Task No. 3 about integer type conversions
*/

public class Solution {
    public static void main(String[] args) {
        float f = (long) 128.50;
        int i = (byte) f;
        int b = (byte) (i + f);
        System.out.println(b);
    }
}
