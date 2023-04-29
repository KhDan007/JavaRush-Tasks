package en.javarush.task.jdk13.task03.task0313;

/* 
Sam I Am
*/

public class Solution {
    public static void main(String[] args) {
        String sam = "Sam";
        String am = "Am";
        String i = "I";

        System.out.printf("%s%s%s\n", sam, i, am);
        System.out.printf("%s%s%s\n", sam, am, i);
        System.out.printf("%s%s%s\n", am, sam, i);
        System.out.printf("%s%s%s\n", am, i, sam);
        System.out.printf("%s%s%s\n", i, am, sam);
        System.out.printf("%s%s%s\n", i, sam, am);
    }
}
