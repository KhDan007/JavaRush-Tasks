package com.javarush.task.task19.task1904;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) throws IOException {
    }

    public static class PersonScannerAdapter implements PersonScanner {
        private final Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            String line = fileScanner.nextLine();
            String[] lineData = line.split(" ");
            SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy", Locale.ENGLISH);
            Date date;
            try {
                date = sdf.parse(lineData[3] + lineData[4] + lineData[5]);
            } catch (ParseException e) {
                throw new IllegalArgumentException(e);
            }
            return new Person(lineData[1], lineData[2], lineData[0], date);
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
