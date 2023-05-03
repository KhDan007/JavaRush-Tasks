package en.javarush.task.jdk13.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Only for the rich
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Guy1", 1000);
        map.put("Guy2", 200);
        map.put("Guy3", 300);
        map.put("Guy4", 700);
        map.put("Guy5", 1200);
        map.put("Guy6", 1100);
        map.put("Guy7", 100);
        map.put("Guy8", 50);
        map.put("Guy9", 3000);
        map.put("Guy10", 4000);
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        Map<String, Integer> copy = Map.copyOf(map);
        for (Map.Entry<String, Integer> pair : copy.entrySet()) {
            if (pair.getValue() < 500) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}