package en.javarush.task.pro.task09.task0908;

/* 
Binary to hexadecimal converter
*/

public class Solution {
    public static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("Binary number " + binaryNumber + " is equal to hexadecimal number " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Hexadecimal number " + hexNumber + " is equal to binary number " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {
        if (binaryNumber == null) return "";
        for (int i = 0; i < binaryNumber.length(); i++) {
            if (binaryNumber.charAt(i) != '0' && binaryNumber.charAt(i) != '1') {
                return "";
            }
        } // Check if entered number is invalid

        int remainder = binaryNumber.length() % 4;
        StringBuilder copy = new StringBuilder();
        for (int i = 0; i < remainder; i++) {
            copy.insert(0, "0");
        }
        copy.append(binaryNumber);

        StringBuilder hexNumber = new StringBuilder();
        int curr = 0;
        int index = 0;
        int move = 3;
        int check = 3;
        for (int i = 0; i < copy.length(); i++) {
            curr += Character.getNumericValue(copy.charAt(move - i)) * Math.pow(2, index);
            index++;
            if (check - i == 0) {
                move += 8;
                check += 4;
                index = 0;
                hexNumber.append(HEX.charAt(curr));
                curr = 0;
            }
        }
        return hexNumber.toString();
    }

    public static String toBinary(String hexNumber) {
        if (hexNumber == null) return ""; // Check if entered number is invalid
        StringBuilder binaryNumber = new StringBuilder();
        for (int i = 0; i < hexNumber.length(); i++) {
            if (hexNumber.charAt(i) != '0' && hexNumber.charAt(i) != '1' && hexNumber.charAt(i) != '2' && hexNumber.charAt(i) != '3' && hexNumber.charAt(i) != '4' &&
                    hexNumber.charAt(i) != '5' && hexNumber.charAt(i) != '6' && hexNumber.charAt(i) != '7' && hexNumber.charAt(i) != '8' && hexNumber.charAt(i) != '9' &&
                    hexNumber.charAt(i) != 'a' && hexNumber.charAt(i) != 'b' && hexNumber.charAt(i) != 'c' && hexNumber.charAt(i) != 'd' && hexNumber.charAt(i) != 'e' &&
                    hexNumber.charAt(i) != 'f') {
                return "";
            } // Check if entered number is invalid

            int index = HEX.indexOf(hexNumber.charAt(i));
            if (index <= 0) {
                binaryNumber.append("0000");
                continue;
            }
            StringBuilder subResult = new StringBuilder();
            while (index != 0) {
                subResult.insert(0, index % 2);
                index /= 2;
            }
            binaryNumber.append(subResult);
        }
        return binaryNumber.toString();
    }
}
