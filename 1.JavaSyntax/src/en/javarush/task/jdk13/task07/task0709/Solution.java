package en.javarush.task.jdk13.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Expressing ourselves more concisely
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // Creating a list
        ArrayList<String> list = new ArrayList<String>();
        // Initializing a scanner
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            list.add(scanner.nextLine());
        }
        // Finding the shortest strings
        ArrayList<String> shortestList = new ArrayList<String>();
        String tempShortest = list.get(0);
        shortestList.add(tempShortest);
        for (int i = 1; i < list.size(); i++) {
            if (tempShortest.length() > list.get(i).length()) {
                tempShortest = list.get(i);
                shortestList.clear();
                shortestList.add(tempShortest);
            } else if (tempShortest.length() == list.get(i).length()) {
                shortestList.add(list.get(i));
            }
        }
        // Displaying the list of the shortest strings
        for (String elem : shortestList) {
            System.out.println(elem);
        }
    }
}
