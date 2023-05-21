package com.javarush.task.task19.task1907;

        import java.io.*;
        import java.util.regex.Matcher;
        import java.util.regex.Pattern;

/*
Считаем слово
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        long count = 0;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileReader fr = new FileReader(reader.readLine())
        ) {
            StringBuilder fBuilder = new StringBuilder();
            while (fr.ready()) {
                fBuilder.append(Character.toChars(fr.read()));
            }
            Pattern pattern = Pattern.compile("\\bworld\\b");
            Matcher matcher = pattern.matcher(fBuilder.toString());
            while (matcher.find()) {
                count++;
            }
        }
        finally {
            System.out.println(count);
        }
    }
}
