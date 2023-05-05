package en.javarush.task.jdk13.task09.task0918;

/* 
Creating your own exceptions
*/

import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) {
    }

    static class MyException extends RuntimeException {
    }

    static class MyException2 extends IndexOutOfBoundsException {
    }

    static class MyException3 extends FileNotFoundException {
    }

    static class MyException4 extends IOException {
    }
}

