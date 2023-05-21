package com.javarush.task.task19.task1915;

import java.io.*;

/* 
Дублируем текст
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileOutputStream fileOutputStream = new FileOutputStream(reader.readLine())
        ) {
            PrintStream consoleStream = System.out;
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            PrintStream myStream = new PrintStream(outputStream);
            System.setOut(myStream);

            testString.printSomething();
            System.setOut(consoleStream);

            System.out.println(outputStream);
            fileOutputStream.write(outputStream.toString().getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

