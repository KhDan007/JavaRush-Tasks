package en.javarush.task.jdk13.task09.task0906;

/* 
Logging stack traces
*/

public class Solution {

    public static void main(String[] args) {
        log("In method");
    }

    public static void log(String text) {
        StackTraceElement elem = Thread.currentThread().getStackTrace()[2];
        System.out.println(elem.getFileName() + ": " + elem.getMethodName() + ": " + text);
    }
}
