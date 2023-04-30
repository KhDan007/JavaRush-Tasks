package en.javarush.task.jdk13.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Minimum or maximum
*/

public class Solution {

    public static ArrayList<String> strings;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        strings = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            strings.add(reader.readLine());
        }
        String tempMin = strings.get(0);
        String tempMax = strings.get(0);
        int minFirstOccurrence = 0;
        int maxFirstOccurrence = 0;
        for (int i = 1; i < strings.size(); i++) {
            if (tempMin.length() > strings.get(i).length()) {
                tempMin = strings.get(i);
                minFirstOccurrence = i;
            }
            if (tempMax.length() < strings.get(i).length()) {
                tempMax = strings.get(i);
                maxFirstOccurrence = i;
            }
        }
        System.out.println(strings.get(Math.min(minFirstOccurrence, maxFirstOccurrence)));
    }
}
