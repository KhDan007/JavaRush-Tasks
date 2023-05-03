package en.javarush.task.jdk13.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Shared last names and first names
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        Map<String, String> result = new HashMap<>();
        result.put("Guy1", "Code");
        result.put("Guy5", "nocode");
        result.put("Guy3", "Code");
        result.put("Guy4", "nocode");
        result.put("Guy5", "nocode");
        result.put("Guy5", "Code");
        result.put("Guy7", "nocode");
        result.put("Guy8", "nocode");
        result.put("Guy9", "Code");
        result.put("Guy10", "Code");
        return result;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
