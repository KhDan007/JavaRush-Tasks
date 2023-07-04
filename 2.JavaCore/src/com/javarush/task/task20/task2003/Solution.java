package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* 
Знакомство с properties
*/

public class Solution {

    public static Map<String, String> runtimeStorage = new HashMap<>();

    public static void save(OutputStream outputStream) throws IOException {
        Properties props = new Properties();
        for (Map.Entry<String, String> pair : runtimeStorage.entrySet()) {
            props.setProperty(pair.getKey(), pair.getValue());
        }
        props.store(outputStream, "save data from runtimeStorage");
    }

    public static void load(InputStream inputStream) throws IOException {
        Properties props = new Properties();
        props.load(inputStream);
        for (String key : props.stringPropertyNames()) {
            String value = props.getProperty(key);
            runtimeStorage.put(key, value);
        }
    }

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fos = new FileInputStream(reader.readLine())) {
             load(fos);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(runtimeStorage);
    }
}
