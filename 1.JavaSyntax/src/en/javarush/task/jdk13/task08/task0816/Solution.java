package en.javarush.task.jdk13.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* 
Remove all people born in the summer
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Smith", dateFormat.parse("MAY 1 2012"));
        map.put("Kevin", dateFormat.parse("MARCH 1 2000"));
        map.put("Bro", dateFormat.parse("MARCH 1 2000"));
        map.put("Brah", dateFormat.parse("APRIL 1 2000"));
        map.put("Max", dateFormat.parse("JUNE 1 2000"));
        map.put("Dan", dateFormat.parse("JULY 1 2000"));
        map.put("Sula", dateFormat.parse("AUGUST 1 2000"));
        map.put("Adel", dateFormat.parse("MARCH 1 2000"));
        map.put("Meow", dateFormat.parse("MARCH 1 2000"));
        map.put("Meok", dateFormat.parse("MARCH 1 2000"));
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        Map<String, Date> copy = Map.copyOf(map);
        for (Map.Entry<String, Date> pair : copy.entrySet()) {
            if (5 <= pair.getValue().getMonth() && pair.getValue().getMonth() <= 7) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) throws ParseException {
    }
}
