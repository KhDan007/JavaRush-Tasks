package en.javarush.task.jdk13.task08.task0817;

import java.util.HashMap;
import java.util.Map;

/* 
We don't need repeats
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

    public static void removeFirstNameDuplicates(Map<String, String> map) {
        for (Map.Entry<String, String> pair : map.entrySet()) {
            boolean condition = false;
            for (Map.Entry<String, String> subPair : map.entrySet()) {
                if (pair.getKey().equals(subPair.getKey())) continue;
                if (pair.getValue().equals(subPair.getValue())) {
                    condition = true;
                    break;
                }
            }
            if (condition) removeItemFromMapByValue(map, pair.getValue());
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}
