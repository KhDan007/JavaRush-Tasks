package com.javarush.task.task14.task1420;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
НОД
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int min = Math.min(a,b);
        int GCD = 0;

        for (int i = min; i > 0 ; i--) {
            if (a % i == 0 && b % i == 0) {
                GCD = i;
                break;
            }
        }

        System.out.println(GCD);
    }
}
