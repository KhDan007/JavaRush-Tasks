package en.javarush.task.jdk13.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
ConsoleReader class
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static int readInt() throws Exception {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static double readDouble() throws Exception {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    public static boolean readBoolean() throws Exception {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextBoolean();
    }

    public static void main(String[] args) throws Exception {

    }
}
