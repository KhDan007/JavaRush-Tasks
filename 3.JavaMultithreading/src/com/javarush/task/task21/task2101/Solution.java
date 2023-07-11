package com.javarush.task.task21.task2101;

/* 
Определяем адрес сети
*/

public class Solution {
    public static void main(String[] args) {
        byte[] ip = new byte[]{(byte) 192, (byte) 168, 1, 2};
        byte[] mask = new byte[]{(byte) 255, (byte) 255, (byte) 254, 0};
        byte[] netAddress = getNetAddress(ip, mask);
        print(ip);          //11000000 10101000 00000001 00000010
        print(mask);        //11111111 11111111 11111110 00000000
        print(netAddress);  //11000000 10101000 00000000 00000000
    }

    public static byte[] getNetAddress(byte[] ip, byte[] mask) {
        byte[] result = new byte[4];
        for (int i = 0; i < ip.length; i++) {
            result[i] = (byte) (Byte.toUnsignedInt(ip[i]) & Byte.toUnsignedInt(mask[i]));
        }
        return result;
    }

    public static void print(byte[] bytes) {
        StringBuilder result = new StringBuilder();
        for (byte b : bytes) {
            StringBuilder s = new StringBuilder(Integer.toBinaryString(b & 0xff));
            while (s.length() < 8) {
                s.insert(0, "0");
            }
            result.append(s).append(" ");
        }
        System.out.println(result);
    }
}
