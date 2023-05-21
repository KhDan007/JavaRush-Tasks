package com.javarush.task.task19.task1913;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Выводим только цифры
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream myPrintStream = new PrintStream(outputStream);
        System.setOut(myPrintStream);

        testString.printSomething();
        System.setOut(consoleStream);

        Matcher matcher = Pattern.compile("\\d").matcher(outputStream.toString());
        while (matcher.find()) {
            System.out.print(matcher.group());
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's 1 a 23 text 4 f5-6or7 tes8ting");
        }
    }
}
