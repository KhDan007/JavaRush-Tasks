package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) {
        try (BufferedReader fileReader = new BufferedReader(new FileReader(args[0]))) {
            while (fileReader.ready()) {
                StringBuilder fullNameBuilder = new StringBuilder();
                String[] lineData = fileReader.readLine().split(" ");
                int startingIdx = 0;
                for (int i = 0; i < lineData.length; i++) {
                    try {
                        Integer.parseInt(lineData[i]);
                        startingIdx = i;
                        break;
                    } catch (NumberFormatException ignored) {
                        fullNameBuilder.append(lineData[i]).append(" ");
                    }
                }
                SimpleDateFormat SDFormat = new SimpleDateFormat("ddMMyyyy", Locale.ENGLISH);
                String day = Integer.parseInt(lineData[startingIdx]) < 10 ? "0" + lineData[startingIdx] : lineData[startingIdx];
                String month = Integer.parseInt(lineData[startingIdx+1]) < 10 ? "0" + lineData[startingIdx+1] : lineData[startingIdx+1];
                Date date = SDFormat.parse(day + month + lineData[startingIdx+2]);
                PEOPLE.add(new Person(fullNameBuilder.toString().trim(), date));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        for (Person person : PEOPLE) {
            System.out.println(person.getName() + " " + person.getBirthDate());
        }
    }
}
