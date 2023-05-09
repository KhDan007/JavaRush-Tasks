package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        String urlParams = url.substring(url.indexOf('?') + 1);
        String[] urlParamsArray = urlParams.split("&");

        String obj = null;
        for (String s : urlParamsArray) {
            String[] currentParamArray = s.split("=");
            String paramName = currentParamArray[0];
            System.out.print(paramName + " ");
            if (paramName.equals("obj")) {
                obj = currentParamArray[1];
            }
        }
        if (obj != null) {
            System.out.println();
            try {
                alert(Double.parseDouble(obj));
            } catch (NumberFormatException e) {
                alert(obj);
            }

        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
