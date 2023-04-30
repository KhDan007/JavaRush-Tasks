package en.javarush.task.jdk13.task07.task0716;

import java.util.ArrayList;

/* 
R or L
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
//        strings.add("rose");
//        strings.add("love");
//        strings.add("lyra");
//        "rose", "measure", "love", "lyre", "wade", "bark"
        strings.add("rose");
        strings.add("measure");
        strings.add("love");
        strings.add("lyre");
        strings.add("wade");
        strings.add("bark");
        strings.add("bark");
        strings.add("bark");
        strings.add("lol");
        strings.add("leave");
//        strings.add("lor");
//        strings.add("rol");
//        strings.add("meow");


        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        for (int i = 0; i < strings.size();) {
            boolean isR = false;
            boolean isL = false;
            for (int j = 0; j < strings.get(i).length(); j++) {
                if (strings.get(i).charAt(j) == 'r') {
                    isR = true;
                }
                if (strings.get(i).charAt(j) == 'l') {
                    isL = true;
                }
            }
            if (isR && isL) {
                i++;
                continue;
            }
            if (isR) {
                strings.remove(i);
                continue;
            } else if (isL) {
                strings.add(i, strings.get(i));
                i+=2;
                continue;
            }
            i++;
        }
        return strings;
    }
}