package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    static Hippodrome game;
    private List<Horse> horses;

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public static void main(String[] args) {
        List<Horse> horses = new ArrayList<>();
        horses.add(new Horse("Mike", 3, 0));
        horses.add(new Horse("Kevin", 3, 0));
        horses.add(new Horse("Joe", 3, 0));

        game = new Hippodrome(horses);
        game.run();
        game.printWinner();
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void print() {
        for (Horse horse : horses) {
            horse.print();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }

    public void move() {
        for (Horse horse : horses) {
            horse.move();
        }
    }

    public Horse getWinner() {
        Horse maxDistanceHorse = new Horse("maxDistanceHorse", 0, 0);
        for (int i = 0; i < 3; i++) {
            if (horses.get(i).getDistance() > maxDistanceHorse.getDistance()) {
                maxDistanceHorse = horses.get(i);
            }
        }
        return maxDistanceHorse;
    }

    public void printWinner() {
        System.out.println("Winner is " + getWinner().getName() + "!");
    }
}
