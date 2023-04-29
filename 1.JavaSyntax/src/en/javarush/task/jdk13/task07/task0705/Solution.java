package en.javarush.task.jdk13.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
One large array and two small ones
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] bigArr = new int[20];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            bigArr[i] = Integer.parseInt(reader.readLine());
        }
        int[] smallArr1 = new int[10];
        int[] smallArr2 = new int[10];
        for (int i = 0; i < 10; i++) {
            smallArr1[i] = bigArr[i];
        }
        for (int i = 0; i < 10; i++) {
            smallArr2[i] = bigArr[i+10];
        }

        for (int i : smallArr2) {
            System.out.println(i);
        }
    }
}
