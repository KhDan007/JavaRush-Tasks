package com.javarush.task.task16.task1603;

import java.util.ArrayList;
import java.util.List;

/* 
Список и нити
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        SpecialThread task1 = new SpecialThread();
        Thread thread1 = new Thread(task1);
        list.add(thread1);

        SpecialThread task2 = new SpecialThread();
        Thread thread2 = new Thread(task2);
        list.add(thread2);

        SpecialThread task3 = new SpecialThread();
        Thread thread3 = new Thread(task3);
        list.add(thread3);

        SpecialThread task4 = new SpecialThread();
        Thread thread4 = new Thread(task4);
        list.add(thread4);

        SpecialThread task5 = new SpecialThread();
        Thread thread5 = new Thread(task5);
        list.add(thread5);
    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}
