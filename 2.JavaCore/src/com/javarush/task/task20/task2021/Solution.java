package com.javarush.task.task20.task2021;

import java.io.*;

/* 
Сериализация под запретом
*/

public class Solution implements Serializable {
    public static class SubSolution extends Solution {
        private void writeObject(ObjectOutputStream oos) throws IOException {
            throw new NotSerializableException("Not today!");
        }
        private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
            throw new NotSerializableException("Not today!");
        }
    }

    public static void main(String[] args) {

    }
}
