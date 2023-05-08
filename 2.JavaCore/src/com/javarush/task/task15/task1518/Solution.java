package com.javarush.task.task15.task1518;

/* 
Статики и котики
*/

public class Solution {
    public static Cat cat;

    static
    {
        cat = new Cat();
        cat.name = "bruh";
        System.out.println(cat);
    }

    public static void main(String[] args) {

    }

    public static class Cat {
        public String name;

        @Override
        public String toString() {
            return name;
        }
    }
}
