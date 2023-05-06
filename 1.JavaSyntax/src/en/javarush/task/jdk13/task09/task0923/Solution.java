package en.javarush.task.jdk13.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Vowels and consonants
*/

public class Solution {
    public static char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u'};

    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String line = reader.readLine();
            for (int i = 0; i < line.length(); i++) {
                if (isVowel(line.charAt(i))) {
                    System.out.print(line.charAt(i) + " ");
                }
            }
            System.out.println();
            for (int i = 0; i < line.length(); i++) {
                if (isVowel(line.charAt(i)) || line.charAt(i) == ' ') {
                    continue;
                }
                System.out.print(line.charAt(i) + " ");
            }
        }
    }

    // The method checks whether a letter is a vowel
    public static boolean isVowel(char character) {
        character = Character.toLowerCase(character);  // Convert to lowercase
        for (char vowel : vowels) {  // Look for vowels in the array
            if (character == vowel) {
                return true;
            }
        }
        return false;
    }
}