package en.javarush.task.jdk13.task08.task0819;

import java.util.HashSet;
import java.util.Set;

/* 
Set of cats
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        cats.remove(cats.iterator().next());
        printCats(cats);
    }

    public static Set<Cat> createCats() {
        Set<Cat> cats = new HashSet<>();
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());
        return cats;
    }

    public static void printCats(Set<Cat> cats) {
        for (Cat item : cats) {
            System.out.println(item);
        }
    }

    public static class Cat {

    }
}
