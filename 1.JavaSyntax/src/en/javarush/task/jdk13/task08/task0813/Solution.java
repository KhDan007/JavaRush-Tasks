package en.javarush.task.jdk13.task08.task0813;

import java.util.HashSet;
import java.util.Set;

/* 
20 words that start with the letter "L"
*/

public class Solution {
    public static Set<String> createSet() {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            set.add("L" + i);
        }
        return set;
    }

    public static void main(String[] args) {

    }
}
