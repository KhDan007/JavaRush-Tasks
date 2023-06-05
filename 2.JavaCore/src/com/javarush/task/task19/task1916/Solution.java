package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

/*

C:\Users\dan\Desktop\test.txt
C:\Users\dan\Desktop\test2.txt

 */

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader fileReader1 = new BufferedReader(new FileReader(reader.readLine()));
             BufferedReader fileReader2 = new BufferedReader(new FileReader(reader.readLine()))
        ) {
            ArrayList<String> lineList1 = new ArrayList<>();
            ArrayList<String> lineList2 = new ArrayList<>();

            while (fileReader1.ready()) {
                lineList1.add(fileReader1.readLine());
            }
            while (fileReader2.ready()) {
                lineList2.add(fileReader2.readLine());
            }

            lineList1.add("");
            lineList2.add("");
            lineList1.add("");
            lineList2.add("");

            int idx1 = 0;
            int idx2 = 0;

            while (!lineList1.get(idx1).equals("") || !lineList2.get(idx2).equals("")) {
                if (lineList1.get(idx1).equals(lineList2.get(idx2))) {
                    lines.add(new LineItem(Type.SAME, lineList1.get(idx1)));
                } else if (lineList1.get(idx1 + 1).equals(lineList2.get(idx2))) {
                    lines.add(new LineItem(Type.REMOVED, lineList1.get(idx1)));
                    idx2--;
                } else if (lineList2.get(idx2 + 1).equals(lineList1.get(idx1))) {
                    lines.add(new LineItem(Type.ADDED, lineList2.get(idx2)));
                    idx1--;
                }
                idx1++;
                idx2++;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        for (LineItem lineItem : lines) {
            System.out.println(lineItem);
        }
    }


    public enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }

        @Override
        public String toString() {
            return type + " " + line;
        }
    }
}
