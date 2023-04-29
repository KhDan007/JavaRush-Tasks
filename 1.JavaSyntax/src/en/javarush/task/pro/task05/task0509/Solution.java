package en.javarush.task.pro.task05.task0509;

/* 
Multiplication table
*/

public class Solution {

    public static int[][] MULTIPLICATION_TABLE;

    public static void main(String[] args) {
        MULTIPLICATION_TABLE = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                int currValue = (i+1) * (j+1);
                MULTIPLICATION_TABLE[i][j] = currValue;
                System.out.print(currValue + " ");
            }
            System.out.println();
        }
    }
}
