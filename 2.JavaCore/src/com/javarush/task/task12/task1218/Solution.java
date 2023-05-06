package com.javarush.task.task12.task1218;

/* 
Есть, летать и двигаться
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanMove {
        public void move();
    }

    public interface CanEat {
        public void eat();
    }

    public class Dog implements CanMove, CanEat {
        @Override
        public void move() {
            System.out.println("Dog has moved!");
        }

        @Override
        public void eat() {
            System.out.println("Dog has ate");
        }
    }

    public class Duck implements CanMove, CanEat, CanFly {
        @Override
        public void move() {
            System.out.println("Duck has moved!");
        }

        @Override
        public void eat() {
            System.out.println("Duck has ate");
        }

        @Override
        public void fly() {
            System.out.println("Duck has flied");
        }
    }

    public class Car implements CanMove {
        @Override
        public void move() {
            System.out.println("Car has moved!");
        }
    }

    public class Airplane implements CanMove, CanFly {
        @Override
        public void move() {
            System.out.println("Airplane has moved!");
        }

        @Override
        public void fly() {
            System.out.println("Airplane has flied");
        }
    }
}
