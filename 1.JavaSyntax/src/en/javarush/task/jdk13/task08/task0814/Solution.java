package en.javarush.task.jdk13.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Greater than 10? You're not a good fit for us
*/

public class Solution {
    public static Set<Integer> createSet() {
        Set<Integer> set = new HashSet<>();
        for (int i = 5; i < 25; i++) {
            set.add(i);
        }
        return set;
    }

    public static void removeAllNumbersGreaterThan10(Set<Integer> set) {
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() > 10) {
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {

    }
}
