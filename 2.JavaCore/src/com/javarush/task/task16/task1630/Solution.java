package com.javarush.task.task16.task1630;

import java.io.*;
import java.util.Scanner;

/* 
Последовательный вывод файлов
*/

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    static
    {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
        } catch (IOException ignored){}
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    public static class ReadFileThread extends Thread implements ReadFileInterface {
        String fullFileName;
        String fileContent;

        @Override
        public void run() {
            StringBuilder fileContentBuilder = new StringBuilder();
            try (Scanner scanner = new Scanner(new FileInputStream(this.fullFileName))) {
                while (scanner.hasNext()) {
                    fileContentBuilder.append(scanner.nextLine());
                    if (scanner.hasNext()) {
                        fileContentBuilder.append(" ");
                    }
                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }

            this.fileContent = fileContentBuilder.toString();
        }

        @Override
        public void setFileName(String fullFileName) {
            this.fullFileName = fullFileName;
        }

        @Override
        public String getFileContent() {
            if (fileContent == null) return "";
            return fileContent;
        }
    }
}
