package en.javarush.task.jdk13.task09.task0920;

/* 
Countdown from 5 to 0
*/

public class Solution {
    public static void main(String[] args) {
        for (int i = 5; i >= 0; i--) {
            System.out.println(i);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
