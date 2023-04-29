package en.javarush.task.jdk13.task07.task0707;

import java.util.ArrayList;

/* 
5 different strings in a list
*/

public class Solution {

    public static ArrayList<String> list;

    public static void main(String[] args) {
        list = new ArrayList<String>();
        list.add("tgeatgh");
        list.add("gaetheat");
        list.add("tgeaahtgatehtgh");
        list.add("ahtzhateh");
        list.add("aethaetht");

        System.out.println(list.size());

        for (String i : list) {
            System.out.println(i);
        }
    }
}
