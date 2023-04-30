package en.javarush.task.jdk13.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Three arrays
*/

public class Solution {

    public static ArrayList<Integer> numbers = new ArrayList<>();
    public static ArrayList<Integer> divBy3 = new ArrayList<>();
    public static ArrayList<Integer> divBy2 = new ArrayList<>();
    public static ArrayList<Integer> others = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 20; i++) {
            numbers.add(scanner.nextInt());
        }
        for (int elem : numbers) {
            if (elem % 3 == 0 && elem % 2 == 0) {
                divBy3.add(elem);
                divBy2.add(elem);
            } else if (elem % 3 == 0) {
                divBy3.add(elem);
            } else if (elem % 2 == 0) {
                divBy2.add(elem);
            } else {
                others.add(elem);
            }
        }

        printList(divBy3);
        printList(divBy2);
        printList(others);
    }

    public static void printList(ArrayList<Integer> list) {
        for (int elem : list) {
            System.out.println(elem);
        }
    }
}
