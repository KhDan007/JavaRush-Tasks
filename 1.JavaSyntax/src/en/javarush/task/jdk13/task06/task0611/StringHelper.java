package en.javarush.task.jdk13.task06.task0611;

/* 
StringHelper class
*/

public class StringHelper {
    public static String multiply(String text) {
        return text.repeat(5);
    }

    public static String multiply(String text, int count) {
        return text.repeat(count);
    }

    public static void main(String[] args) {
    }
}
