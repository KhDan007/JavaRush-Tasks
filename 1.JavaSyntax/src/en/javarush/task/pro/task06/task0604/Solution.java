package en.javarush.task.pro.task06.task0604;

/* 
The Liverpool 4
*/

public class Solution {
    public static void main(String[] args) {
        String navigator = "John";
        String pilot = "Paul";
        String secondPilot = "George";
        String flightEngineer = "Ringo";
        createCrew(navigator, pilot, secondPilot, flightEngineer);
    }

    public static void createCrew(String navigator, String pilot, String secondPilot, String flightEngineer) {
        System.out.println("The four who are to conquer the cosmos:");
        System.out.println("Navigator: " + navigator);
        System.out.println("Pilot: " + pilot);
        System.out.println("Second pilot: " + secondPilot);
        System.out.println("Flight engineer:" + flightEngineer);
    }
}
