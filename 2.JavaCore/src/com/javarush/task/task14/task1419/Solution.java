package com.javarush.task.task14.task1419;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.nio.file.FileAlreadyExistsException;
import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (ArithmeticException e) {
            exceptions.add(e);
        }

        try {
            Integer.parseInt("some cringe text");

        } catch (NumberFormatException e) {
            exceptions.add(e);
        }

        try {
            throw new RuntimeException();

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            throw new IOException();

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            throw new IndexOutOfBoundsException();

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            throw new InterruptedIOException();

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            throw new IllegalAccessException();

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            throw new IllegalArgumentException();

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            throw new InterruptedException();

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            throw new FileNotFoundException();

        } catch (Exception e) {
            exceptions.add(e);
        }



    }
}
