package com.javarush.task.task22.task2208;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* 
Формируем WHERE
*/

public class Solution {
    public static void main(String[] args) {
        Map<String,String> params = new HashMap<>();
        params.put("name", "Dan");
        params.put("country", "Kazakhstan");
        params.put("age", null);
        params.put("city", "Astana");

        System.out.println(getQuery(params));
    }

    public static String getQuery(Map<String, String> params) {
        StringBuilder builder = new StringBuilder();
        for (Map.Entry<String, String> pair : params.entrySet()) {
            if (pair.getValue() == null || pair.getKey() == null) continue;
            builder.append(pair.getKey()).append(" = '").append(pair.getValue()).append("' and ");
        }
        if (builder.length() == 0) return "";
        return builder.substring(0, builder.length()-5);
    }
}
