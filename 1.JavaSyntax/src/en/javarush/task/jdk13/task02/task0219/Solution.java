package en.javarush.task.jdk13.task02.task0219;

/* 
Print three times
*/

public class Solution {
    public static void print3(String text) {
        System.out.print(text + " ");
        System.out.print(text + " ");
        System.out.print(text);
    }

    public static void main(String[] args) {
        print3("window");
        print3("file");
    }
}
