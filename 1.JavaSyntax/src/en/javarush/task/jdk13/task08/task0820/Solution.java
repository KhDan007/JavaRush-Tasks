package en.javarush.task.jdk13.task08.task0820;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* 
Animal set
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        Set<Cat> result = new HashSet<Cat>();
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());
        return result;
    }

    public static Set<Dog> createDogs() {
        Set<Dog> result = new HashSet<>();
        result.add(new Dog());
        result.add(new Dog());
        result.add(new Dog());
        return result;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        Set<Object> result = new HashSet<>();
        result.addAll(dogs);
        result.addAll(cats);
        return result;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        Set<Object> copy = Set.copyOf(pets);
        for (Object item : copy) {
            if (cats.contains(item)) {
                pets.remove(item);
            }
        }
    }

    public static void printPets(Set<Object> pets) {
        for (Object item : pets) {
            System.out.println(item);
        }
    }

    public static class Cat {

    }
    public static class Dog {

    }
}
