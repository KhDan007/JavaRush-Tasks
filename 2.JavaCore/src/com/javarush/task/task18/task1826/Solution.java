package com.javarush.task.task18.task1826;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
Шифровка
*/

public class Solution {
    public static void main(String[] args) {
        byte[] buffer = null;
        switch (args[0]) {
            case "-e" -> {
                try (FileInputStream fInput = new FileInputStream(args[1]);
                     FileOutputStream fOutput = new FileOutputStream(args[2])
                ) {
                    buffer = new byte[200];
                    while (fInput.available() > 0) {
                        int count = fInput.read(buffer);
                        encrypt(buffer);
                        fOutput.write(buffer, 0, count);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            case "-d" -> {
                try (FileInputStream fInput = new FileInputStream(args[1]);
                     FileOutputStream fOutput = new FileOutputStream(args[2])
                ) {
                    buffer = new byte[200];
                    while (fInput.available() > 0) {
                        int count = fInput.read(buffer);
                        decrypt(buffer);
                        fOutput.write(buffer, 0, count);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void encrypt(byte[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int prevValue = arr[i];
            int newValue = prevValue + 15;
            if (newValue > 127) {
                newValue = -128 + (newValue - 127);
            }
            arr[i] = (byte) newValue;
        }
    }

    public static void decrypt(byte[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int prevValue = arr[i];
            int newValue = prevValue - 15;
            if (newValue < -128) {
                newValue = 127 + (newValue + 128);
            }
            arr[i] = (byte) newValue;
        }
    }
}
