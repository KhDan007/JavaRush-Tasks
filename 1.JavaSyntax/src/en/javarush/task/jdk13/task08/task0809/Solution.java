package en.javarush.task.jdk13.task08.task0809;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* 
Measure how long it takes to perform 10,000 insertions on each list.
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getInsertTimeInMs(new ArrayList()));
        System.out.println(getInsertTimeInMs(new LinkedList()));
    }

    public static long getInsertTimeInMs(List list) {
        long temp = new Date().getTime();

        insert10000(list);

        return new Date().getTime() - temp;
    }

    public static void insert10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(0, new Object());
        }
    }
}
