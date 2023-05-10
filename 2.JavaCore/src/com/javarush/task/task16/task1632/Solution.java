package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Клубок
*/

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static
    {
        threads.add(new TestThread1());
        threads.add(new TestThread2());
        threads.add(new TestThread3());
        threads.add(new TestThread4());
        threads.add(new TestThread5());
    }

    public static void main(String[] args) throws InterruptedException {

    }

    public static class TestThread1 extends Thread {
        @Override
        public void run() {
            while (true) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ignored) {
                    break;
                }
            }
        }
    }

    public static class TestThread2 extends Thread {
        @Override
        public void run() {
            while (true) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("InterruptedException");
                    break;
                }
            }
        }
    }

    public static class TestThread3 extends Thread {
        @Override
        public void run() {
            while (true) {
                try {
                    System.out.println("Ура");
                    Thread.sleep(500);
                } catch (InterruptedException ignored) {
                    break;
                }
            }
        }
    }

    public static class TestThread4 extends Thread implements Message {
        private boolean isAlive = true;
        @Override
        public void showWarning() {
            isAlive = false;
        }

        @Override
        public void run() {
            while (isAlive) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ignored) {

                }
            }
        }
    }

    public static class TestThread5 extends Thread {
        @Override
        public void run() {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
                double sum = 0;
                String word = reader.readLine();

                while (true) {
                    if (word.equals("N")) {
                        System.out.println(sum);
                        break;
                    } else {
                        double num = Double.parseDouble(word);
                        sum += num;
                        word = reader.readLine();
                    }
                }

            } catch (IOException ignored) {

            }
        }
    }
}