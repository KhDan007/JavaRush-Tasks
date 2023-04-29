package en.javarush.task.jdk13.task09.task0941;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

/* 
IPv6
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(map("2001:db8:11a3:9d7:1f34:8a2e:7a0:765d")));
    }

    public static String[] map(String ipv6) {
        StringTokenizer tokenizer = new StringTokenizer(ipv6);
        ArrayList<String> arrayList = new ArrayList<String>();
        while (tokenizer.hasMoreTokens()) {
            arrayList.add(tokenizer.nextToken(":"));
        }
        String[] array = new String[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            array[i] = arrayList.get(i);
        }
        return array;
    }
}
