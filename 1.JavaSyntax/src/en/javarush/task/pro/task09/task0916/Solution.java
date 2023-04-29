package en.javarush.task.pro.task09.task0916;

/* 
String.format()
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(format("Amigo", 5000));
    }

    public static String format(String name, int salary) {
        String phrase = "My name is %s. I will earn $%d a month.";
        return String.format(phrase, name, salary);
    }
}
