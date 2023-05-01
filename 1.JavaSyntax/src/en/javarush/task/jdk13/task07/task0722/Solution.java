package en.javarush.task.jdk13.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
The end
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String currStr = reader.readLine();
            if (currStr.equals("end")) break;
            list.add(currStr);
        }
        for (String elem : list) {
            System.out.println(elem);
        }
    }
}