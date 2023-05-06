package en.javarush.task.jdk13.task16.task1605;

import java.io.FileNotFoundException;
import java.io.IOException;

/* 
Throwing exceptions
*/

public class Solution {

    public void method1() throws IOException {
        throw new IOException();
    }

    public void method2() throws FileNotFoundException {
        throw new FileNotFoundException();
    }

    public void method3() throws ArithmeticException {
        throw new ArithmeticException();
    }

    public void method4() throws IndexOutOfBoundsException {
        throw new IndexOutOfBoundsException();
    }
}
