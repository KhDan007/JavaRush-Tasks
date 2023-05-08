package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static
    {
        labels.put(15.3, "num1");
        labels.put(13.3, "num2");
        labels.put(12.3, "num3");
        labels.put(11.3, "num4");
        labels.put(16.3, "num5");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
