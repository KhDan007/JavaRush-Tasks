package en.javarush.task.jdk13.task06.task0633;

/* 
Cutting down the middle
*/

public class Solution {
    public static char[][] chars = {
            {'a', 'b', 'c', 'd', 'e', 'f'},
            {'j', 'h', 'i', 'j', 'k', 'l'},
            {'m', 'n', 'o', 'p', 'q', 'r'},
            {'s', 't', 'u', 'v', 'w', 'x'}};

    public static void main(String[] args) {
        printArray();

        for (int i = 0; i < chars.length; i++) {
            if ((i-1 >= 0 && i <= chars.length-2)) {
                for (int j = 0; j < chars[i].length; j++) {
                    if ((j-1 >= 0 && j <= chars[i].length-2)) {
                        chars[i][j] = '-';
                    }
                }
            }

        }

        printArray();
    }

    private static void printArray() {
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars[i].length; j++) {
                System.out.print(chars[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
