package en.javarush.task.jdk13.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Census
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Bro", "Code");
        map.put("Max", "Code");
        map.put("Benjamin", "Franklin");
        map.put("Khamzin", "Daniyal");
        map.put("Niyazov", "Sultan");
        map.put("Fellow", "Bro");
        map.put("Killer", "Code");
        map.put("Good", "Guy");
        map.put("Anabelle", "Code");
        map.put("Dan", "Code");
        return map;
    }

    public static int getSameFirstNameCount(Map<String, String> map, String name) {
        int count = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (pair.getValue().equals(name)) count++;
        }
        return count;
    }

    public static int getSameLastNameCount(Map<String, String> map, String lastName) {
        int count = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (pair.getKey().equals(lastName)) count++;
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
