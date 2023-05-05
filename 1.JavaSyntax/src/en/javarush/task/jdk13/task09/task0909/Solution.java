package en.javarush.task.jdk13.task09.task0909;

/* 
Exception when working with arrays
*/

public class Solution {

    public static void main(String[] args) {
        //write your code here

        int[] array = new int[2];

        try {
            array[8] = 5;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }

        //write your code here
    }
}
