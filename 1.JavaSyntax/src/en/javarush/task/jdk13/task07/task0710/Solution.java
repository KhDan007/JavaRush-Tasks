package en.javarush.task.jdk13.task07.task0710;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
To the top of the list
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>(); // Creating a list
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // Initializing a reader
        for (int i = 0; i < 10; i++) { // Filling the list with 10 keyboard input strings
            list.add(0, reader.readLine());
        }
        // Display contents of the list
        for (String elem : list) {
            System.out.println(elem);
        }
    }
}
