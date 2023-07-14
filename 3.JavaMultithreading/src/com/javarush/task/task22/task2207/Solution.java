package com.javarush.task.task22.task2207;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Обращенные слова
*/

public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) {
        Map<String, Integer> palindromes = new HashMap<>();

        try (BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader fileReader = new BufferedReader(new FileReader(consoleReader.readLine()))
        ) {
            List<String> words = new ArrayList<>();
            while (fileReader.ready()) {
                words.addAll(Arrays.asList(fileReader.readLine().split("[ \n]")));
            }
            for (String word : words) {
                String reversed = new StringBuilder(word).reverse().toString();
                if (palindromes.containsKey(reversed)) {
                    palindromes.compute(reversed, (k, v) -> v + 1);
                    continue;
                }
                palindromes.putIfAbsent(word, 1);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Map.Entry<String, Integer> pair : palindromes.entrySet()) {
            int count = pair.getValue() - (pair.getValue() % 2);
            for (int i = 0; i < count/2; i++) {
                result.add(new Pair(pair.getKey(), new StringBuilder(pair.getKey()).reverse().toString()));
            }
        }
//
//        for (Pair pair : result) {
//            System.out.println(pair);
//        }
    }

    public static class Pair {
        String first;
        String second;

        public Pair() {
        }

        public Pair(String first, String second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return first == null && second == null ? "" :
                    first == null ? second :
                            second == null ? first :
                                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}
