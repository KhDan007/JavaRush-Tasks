package en.javarush.task.jdk13.task08.task0801;

import java.util.HashSet;
import java.util.Set;

/* 
food of plants
*/

public class Solution {
    public static void main(String[] args) {
        Set<String> food = new HashSet<>();
        food.add("watermelon");
        food.add("banana");
        food.add("cherry");
        food.add("pear");
        food.add("cantaloupe");
        food.add("blackberry");
        food.add("ginseng");
        food.add("strawberry");
        food.add("iris");
        food.add("potato");

        for (String elem : food) {
            System.out.println(elem);
        }
    }
}
