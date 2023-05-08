package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;

        String line = reader.readLine();
        while (line.equals("user") || line.equals("loser") || line.equals("coder") || line.equals("proger"))
        {
            if (line.equals("user")) {
                person = new Person.User();
            } else if (line.equals("loser")) {
                person = new Person.Loser();
            } else if (line.equals("coder")) {
                person = new Person.Coder();
            } else {
                person = new Person.Proger();
            }

            doWork(person); //вызываем doWork
            line = reader.readLine();
        }
    }

    public static void doWork(Person person) {
        if (person instanceof Person.User) {
            ((Person.User) person).live();
        } else if (person instanceof Person.Loser) {
            ((Person.Loser) person).doNothing();
        } else if (person instanceof Person.Coder) {
            ((Person.Coder) person).writeCode();
        } else if (person instanceof Person.Proger) {
            ((Person.Proger) person).enjoy();
        }
    }
}
