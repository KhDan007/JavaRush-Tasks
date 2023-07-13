package com.javarush.task.task22.task2202;

/* 
Найти подстроку
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("Амиго и Диего лучшие"));
    }

    public static String getPartOfString(String string) {
        try {
            String[] splitedString = string.split(" ");
            return splitedString[1] + " " + splitedString[2] + " " + splitedString[3] + " " + splitedString[4];
        } catch (IndexOutOfBoundsException | NullPointerException e) {
            throw new TooShortStringException();
        }
    }

    public static class TooShortStringException extends RuntimeException {
    }
}
