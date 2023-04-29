package en.javarush.task.jdk13.task06.task0612;

/* 
Calculator
*/

public class Calculator {
    public static int plus(int a, int b) {
        return a + b;
    }

    public static int minus(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        return (double) a / b;
    }

    public static double percent(int a, int b) {
        return a * ((double) b / 100);
    }

    public static void main(String[] args) {

    }
}