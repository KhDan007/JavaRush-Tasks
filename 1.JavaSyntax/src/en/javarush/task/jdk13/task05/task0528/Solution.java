package en.javarush.task.jdk13.task05.task0528;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/* 
Display today's date
*/

public class Solution {
    public static void main(String[] args) {
        Date date = new Date();
        String currMonth = date.getMonth() + 1 < 10 ? "0" + (date.getMonth() + 1) : String.valueOf(date.getMonth() + 1);
        String currDate = date.getDate() + 1 < 10 ? "0" + date.getDate() : String.valueOf(date.getDate());

        System.out.println(currMonth + " " + currDate + " " + (date.getYear() + 1900));
    }

}
