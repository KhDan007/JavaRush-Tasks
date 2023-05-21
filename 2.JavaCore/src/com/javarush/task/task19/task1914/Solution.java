package com.javarush.task.task19.task1914;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Решаем пример
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream myStream = new PrintStream(outputStream);
        System.setOut(myStream);

        testString.printSomething();
        System.setOut(consoleStream);

        Matcher matcher = Pattern.compile("(\\d+) ([+*\\-]) (\\d+) = ").matcher(outputStream.toString());
        if (matcher.find()) {
            int a = Integer.parseInt(matcher.group(1));
            int b = Integer.parseInt(matcher.group(3));
            int c = switch (matcher.group(2)) {
                case "+" -> a + b;
                case "-" -> a - b;
                case "*" -> a * b;
                default -> 0;
            };

            String result = outputStream.toString().trim() + " " + c;
            System.out.println(result);
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

