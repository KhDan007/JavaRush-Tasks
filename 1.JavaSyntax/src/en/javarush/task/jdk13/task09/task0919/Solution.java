package en.javarush.task.jdk13.task09.task0919;

/* 
Dividing by zero
*/

public class Solution {

    public static void main(String[] args) {
        try {
            divideByZero();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

    public static void divideByZero() throws ArithmeticException {
        System.out.println(9/0);
    }
}
