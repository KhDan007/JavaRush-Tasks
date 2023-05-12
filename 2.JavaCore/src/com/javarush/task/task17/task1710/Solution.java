package com.javarush.task.task17.task1710;

import java.text.SimpleDateFormat;
import java.util.*;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        if (args[0].equals("-c")) {
            Person person = null;
            String[] dateArray = args[3].split("/");
            Date date = new Date();
            date.setDate(Integer.parseInt(dateArray[0]));
            date.setMonth(Integer.parseInt(dateArray[1]) - 1);
            date.setYear(Integer.parseInt(dateArray[2]) - 1900);

            if (args[2].equals("м")) {
                person = Person.createMale(args[1], date);
            } else if (args[2].equals("ж")) {
                person = Person.createFemale(args[1], date);
            }
            if (person != null) {
                allPeople.add(person);
                System.out.println(allPeople.size() - 1);
            } else {
                throw new IllegalArgumentException("Format for -c is: -c name sex(м/ж) birthDate(15/04/1990)");
            }
        } else if (args[0].equals("-r")) {
            try {
                System.out.println(allPeople.get(Integer.parseInt(args[1])));
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException(e);
            }
        } else if (args[0].equals("-u")) {
            Person person = null;
            String[] dateArray = args[4].split("/");
            Date date = new Date();
            date.setDate(Integer.parseInt(dateArray[0]));
            date.setMonth(Integer.parseInt(dateArray[1]) - 1);
            date.setYear(Integer.parseInt(dateArray[2]) - 1900);

            if (args[3].equals("м")) {
                person = Person.createMale(args[2], date);
            } else if (args[3].equals("ж")) {
                person = Person.createFemale(args[2], date);
            }
            if (person != null) {
                allPeople.remove(Integer.parseInt(args[1]));
                allPeople.add(Integer.parseInt(args[1]), person);
            } else {
                throw new IllegalArgumentException("Format for -u is: -c id name sex(м/ж) birthDate(15/04/1990)");
            }
        } else if (args[0].equals("-d")) {
            try {
                Person selectedPerson = allPeople.get(Integer.parseInt(args[1]));
                selectedPerson.setName(null);
                selectedPerson.setSex(null);
                selectedPerson.setBirthDate(null);
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException(e);
            }
        }

//        for (Person person : allPeople) {
//            System.out.println(person);
//        }
    }
}
