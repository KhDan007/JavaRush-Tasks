package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    private static final SimpleDateFormat dateFormat1 = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    private static final SimpleDateFormat dateFormat2 = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

    public static void main(String[] args) {
        switch (args[0]) {
            case "-c":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i += 3) {
                        Date date;
                        try {
                            date = dateFormat1.parse(args[i + 2]);
                        } catch (ParseException e) {
                            throw new IllegalArgumentException(e);
                        }
                        if (args[i + 1].equals("м")) {
                            allPeople.add(Person.createMale(args[i], date));
                        } else {
                            allPeople.add(Person.createFemale(args[i], date));
                        }
                        System.out.println(allPeople.size() - 1);
                    }
                }
                break;
            case "-u":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i += 4) {
                        Date date;
                        try {
                            date = dateFormat1.parse(args[i + 3]);
                        } catch (ParseException e) {
                            throw new IllegalArgumentException(e);
                        }
                        Person curPerson = allPeople.get(Integer.parseInt(args[i]));
                        curPerson.setName(args[i + 1]);
                        curPerson.setSex(getSex(args[i + 2]));
                        curPerson.setBirthDate(date);
                    }
                }
                break;
            case "-d":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        Person curPerson = allPeople.get(Integer.parseInt(args[i]));
                        curPerson.setName(null);
                        curPerson.setSex(null);
                        curPerson.setBirthDate(null);
                    }
                }
                break;
            case "-i":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        Person curPerson = allPeople.get(Integer.parseInt(args[i]));
                        String strDate = dateFormat2.format(curPerson.getBirthDate());
                        System.out.println(curPerson.getName() + " " + getSex(curPerson.getSex()) + " " + strDate);
                    }
                }
                break;
        }
    }

    private static Sex getSex(String s) {
        return s.equals("м") ? Sex.MALE : Sex.FEMALE;
    }

    private static String getSex(Sex sex) {
        return sex.equals(Sex.MALE) ? "м" : "ж";
    }
}
