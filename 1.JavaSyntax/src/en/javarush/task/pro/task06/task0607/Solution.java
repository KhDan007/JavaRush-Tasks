package en.javarush.task.pro.task06.task0607;

/* 
Welcome! But not everyone.
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static void signIn(String username) {
        if (username == "user") {
            return;
        }
        System.out.println("Welcome, " + username);
        System.out.println("We've really missed you, " + username);
    }
}
