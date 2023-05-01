package en.javarush.task.jdk13.task07.task0727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
You need to replace the program's functionality
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> strings = new ArrayList<String>();
        while (true) {
            String string = reader.readLine();
            if (string == null || string.isEmpty()) break;
            strings.add(string);
        }

        ArrayList<String> resultStrings = new ArrayList<String>();
        for (String string : strings) {
            if (string.length()%2 == 0) {
                resultStrings.add(string + " " + string);
            } else {
                resultStrings.add(string + " " + string + " " + string);
            }
        }

        for (String resultString : resultStrings) {
            System.out.println(resultString);
        }
    }
}
