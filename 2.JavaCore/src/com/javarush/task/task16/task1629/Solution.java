package com.javarush.task.task16.task1629;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Только по-очереди!
*/

public class Solution {
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws InterruptedException {
        Read3Strings t1 = new Read3Strings();
        Read3Strings t2 = new Read3Strings();

        t1.start();
        t1.join();

        t2.start();
        t2.join();

        t1.printResult();
        t2.printResult();
    }

    public static class Read3Strings extends Thread {
        private String line1;
        private String line2;
        private String line3;

        @Override
        public void run() {
            try {
                line1 = reader.readLine();
                line2 = reader.readLine();
                line3 = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void printResult() {
            System.out.println(line1 + " " + line2 + " " + line3);
        }
    }
}
